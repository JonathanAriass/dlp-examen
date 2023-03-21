package es.uniovi.dlp.visitor.semantic;

import static org.junit.jupiter.api.Assertions.*;

import es.uniovi.dlp.ast.definitions.VarDefinition;
import org.junit.jupiter.api.Test;

public class SymbolTableTest {

  @Test
  void testInsert() {
    var st = new SymbolTable();
    VarDefinition definition = new VarDefinition( "a", null, 0, 0);
    VarDefinition definition2 = new VarDefinition( "a", null, 0, 0);

    assertTrue(st.insert(definition));
    assertEquals(definition.getScope(), 0);
    assertFalse(st.insert(definition));

    st.set();

    assertTrue(st.insert(definition2));
    assertEquals(definition2.getScope(), 1);
    assertFalse(st.insert(definition2));

    st.reset();

    assertFalse(st.insert(definition));
  }

  @Test
  void testFind() {
    SymbolTable st = new SymbolTable();
    VarDefinition definition = new VarDefinition( "a", null, 0, 0);
    VarDefinition definition2 = new VarDefinition( "b", null, 0, 0);

    assertTrue(st.insert(definition));
    assertNotNull(st.find("a"));
    assertNull(st.find("b"));

    st.set();

    assertTrue(st.insert(definition2));
    assertNotNull(st.find("a"));
    assertNotNull(st.find("b"));
    assertNull(st.find("c"));

    st.reset();

    assertNotNull(st.find("a"));
    assertNull(st.find("b"));
  }

  @Test
  void testFindInCurrentScope() {
    SymbolTable st = new SymbolTable();
    VarDefinition definition = new VarDefinition( "a", null, 0, 0);
    VarDefinition definition2 = new VarDefinition( "b", null, 0, 0);

    assertTrue(st.insert(definition));
    assertNotNull(st.findInCurrentScope("a"));
    assertNull(st.findInCurrentScope("b"));

    st.set();

    assertTrue(st.insert(definition2));
    assertNotNull(st.findInCurrentScope("b"));
    assertNull(st.findInCurrentScope("a"));
    assertNull(st.findInCurrentScope("c"));

    st.reset();

    assertNotNull(st.findInCurrentScope("a"));
    assertNull(st.findInCurrentScope("b"));
  }
}
