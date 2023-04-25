package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.types.CharType;
import es.uniovi.dlp.ast.types.DoubleType;
import es.uniovi.dlp.ast.types.IntType;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CodeGenerator {

  private String fileName;
  private OutputStreamWriter out;

  public CodeGenerator(String fileName, OutputStreamWriter writer) {
    this.fileName = fileName;
    this.out = writer;
  }

  private void write(String text) {

    write(text, true);
  }

  private void write(String text, boolean tab) {

    try {
      if (!tab) out.write(text);
      else out.write("\t" + text);
      newLine();
      out.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void newLine() {
    try {
      out.write("\n");
      out.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void comments(String comment) {
    write("' " + comment);
  }

  public void label(int label) {
    write("label" + label + ":", false);
  }

  public void label(String label) {
    newLine();
    write(label + ":", false);
  }

  private String getTypeSuffix(Type type) {
    if (type instanceof CharType) {
      return "b";
    }
    if (type instanceof DoubleType) {
      return "f";
    }
    return "i";
  }

  public void call(String label) {
    write("call\t" + label);
  }

  public void callMain() {
    write("' Invocation to the main function", false);
    write("call main", false);
    write("halt", false);
    newLine();
  }

  public void source() {
    newLine();
    write("#source \"" + fileName + "\"");
    newLine();
  }

  public void line(int line) {
    newLine();
    write("#line \t" + line, false);
  }

  public void pushb(int asciCode) {
    write("pushb\t" + asciCode);
  }

  public void push(Type type, int constant) {
    write("push" + getTypeSuffix(type) + "\t" + constant);
  }

  public void push(Type type, double constant) {
    write("push" + getTypeSuffix(type) + "\t" + constant);
  }

  public void pusha(int address) {
    write("pusha\t" + address);
  }

  public void pushbp() {
    write("push\tbp");
  }

  public void load(Type type) {
    write("load" + getTypeSuffix(type));
  }

  public void store(Type type) {
    write("store" + getTypeSuffix(type));
  }

  public void pop(Type type) {
    write("pop" + getTypeSuffix(type));
  }

  public void dup(Type type) {
    write("dup" + getTypeSuffix(type));
  }

  public void arithmetic(String operator, Type type) {
    String op = "";
    switch (operator) {
      case "+":
        //                add(type);
        op = "add";
        break;
      case "-":
        op = "sub";
        break;
      case "*":
        op = "mul";
        break;
      case "/":
        op = "div";
        break;
      case "%":
        op = "mod";
        break;
    }
    instructionDispatcher(op, type);
  }

  public void comparison(String operator, Type type) {
    String op = "";
    switch (operator) {
      case ">":
        op = "gt";
        break;
      case "<":
        op = "lt";
        break;
      case ">=":
        op = "ge";
        break;
      case "<=":
        op = "le";
        break;
      case "==":
        op = "eq";
        break;
      case "!=":
        op = "ne";
        break;
    }

    instructionDispatcher(op, type);
  }

  public void logical(String operator) {
    String op = "";
    switch (operator) {
      case "&&":
        op = "and";
        break;
      case "||":
        op = "or";
        break;
      case "!":
        op = "not";
        break;
    }

    write(op);
  }

  public void out(Type type) {
    write("out" + getTypeSuffix(type));
  }

  public void read(Type type) {
    write("in" + getTypeSuffix(type));
  }

  public void enter(int size) {
    write("enter\t" + size);
  }

  public void ret(int returnSize, int localVarsSize, int paramsSize) {
    write("ret\t" + returnSize + ", " + localVarsSize + ", " + paramsSize);
  }

  //    public void add(Type type) {
  //        write("add" + getTypeSuffix(type));
  //    }

  public void promoteTo(Type from, Type to) {
    if (from instanceof IntType) {
      if (to instanceof DoubleType) i2f();
      if (to instanceof CharType) i2b();
    }
    if (from instanceof DoubleType) {
      if (to instanceof IntType) f2i();
      if (to instanceof CharType) {
        f2i();
        i2b();
      }
    }
    if (from instanceof CharType) {
      if (to instanceof DoubleType) {
        b2i();
        i2f();
      }
      if (to instanceof IntType) b2i();
    }
  }

  public void b2i() {
    write("b2i");
  }

  public void i2f() {
    write("i2f");
  }

  public void f2i() {
    write("f2i");
  }

  public void i2b() {
    write("i2b");
  }

  public void add() {
    write("addi");
  }

  public void mul() {
    write("muli");
  }

  public void instructionDispatcher(String op, Type type) {
    write(op + getTypeSuffix(type));
  }
}
