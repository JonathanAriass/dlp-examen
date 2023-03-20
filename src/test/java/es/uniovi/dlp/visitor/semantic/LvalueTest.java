package es.uniovi.dlp.visitor.semantic;

import static es.uniovi.dlp.TestHelpers.runCompiler;
import static org.junit.jupiter.api.Assertions.*;

import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class LvalueTest {

  @Test
  void errorLvalueInRead() {
    runCompiler("examples/errors/lvalue/read.xana");
    assertFoundErrors(Arrays.asList(new Error(4, 8, ErrorReason.LVALUE_REQUIRED)));
  }

  @Test
  void errorLvalueAssignment() {
    runCompiler("examples/errors/lvalue/arithmetic.xana");
    assertFoundErrors(Arrays.asList(new Error(4, 5, ErrorReason.LVALUE_REQUIRED)));
  }

  @Test
  void correctLvalue() {
    runCompiler("examples/errors/valid_examples/lvalue.xana");
    assertFoundErrors(new ArrayList<>());
  }

  private static void assertFoundErrors(List<Error> errors) {
    var foundErrors = ErrorManager.getInstance().getErrors();
    assertIterableEquals(foundErrors, errors);
  }
}
