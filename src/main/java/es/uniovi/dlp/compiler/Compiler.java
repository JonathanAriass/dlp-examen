package es.uniovi.dlp.compiler;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.parser.XanaLexer;
import es.uniovi.dlp.parser.XanaParser;
import es.uniovi.dlp.visitor.codegeneration.CodeGenerator;
import es.uniovi.dlp.visitor.codegeneration.ExecuteCGVisitor;
import es.uniovi.dlp.visitor.semantic.IdentificationVisitor;
import es.uniovi.dlp.visitor.semantic.OffsetVisitor;
import es.uniovi.dlp.visitor.semantic.TypeCheckingVisitor;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Compiler {
  private final String filename;
  private OutputStreamWriter out;
  private Program program;
  private boolean reportErrors = true;
  private boolean showDebug = false;

  public Compiler(String filename) {
    //    this.filename = filename;
    this(filename, new OutputStreamWriter(System.out));
  }

  public Compiler(String filename, OutputStreamWriter writer) {
    this.filename = filename;
    this.out = writer;
  }

  public void run() throws IOException {
    ErrorManager.getInstance().clearErrors();
    program = parse(filename);
    assignScope();
    assignType();
    assignOffset();
    checkErrors();
    generateCode();
  }

  private void checkErrors() {
    if (!reportErrors) return;

    ErrorManager errorManager = ErrorManager.getInstance();
    if (errorManager.hasErrors()) {
      errorManager.getErrors().forEach(System.err::println);
      System.exit(-1);
    }
  }

  public Program getProgram() {
    return program;
  }

  private Program parse(String file) throws IOException {
    CharStream input = CharStreams.fromFileName(file);
    XanaLexer lexer = new XanaLexer(input);

    CommonTokenStream tokens = new CommonTokenStream(lexer);
    XanaParser parser = new XanaParser(tokens);

    return parser.program().ast;
  }

  private void assignScope() {
    IdentificationVisitor identificationVisitor = new IdentificationVisitor();
    identificationVisitor.visit(program, null);
  }

  private void assignType() {
    TypeCheckingVisitor typeCheckingVisitor = new TypeCheckingVisitor();
    typeCheckingVisitor.visit(program, null);
  }

  private void assignOffset() {
    OffsetVisitor offsetVisitor = new OffsetVisitor();
    offsetVisitor.visit(program, null);
  }

  private void generateCode() {
    File file = new File(filename);
    ExecuteCGVisitor executeCGVisitor =
        new ExecuteCGVisitor(new CodeGenerator(file.getName(), out));
    executeCGVisitor.visit(program, null);
  }

  public void setReportErrors(boolean reportErrors) {
    this.reportErrors = reportErrors;
  }

  public void setShowDebug(boolean b) {
    this.showDebug = b;
  }
}
