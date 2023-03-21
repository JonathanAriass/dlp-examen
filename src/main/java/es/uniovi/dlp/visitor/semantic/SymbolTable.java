package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.Definition;

import java.util.*;

public class SymbolTable {
  private int scope = 0;
  private List<Map<String, Definition>> table;

  public SymbolTable() {
    table = new ArrayList<>();
    table.add(new HashMap<>());
  }

  public void set() {
    table.add(new HashMap<>());
    scope++;
  }

  public void reset() {
    table.remove(scope);
    scope--;
  }

  public boolean insert(Definition definition) {
    Map<String, Definition> scopeTable = table.get(scope);

    if (!scopeTable.containsKey(definition.getName())) {
      definition.setScope(scope);
      scopeTable.put(definition.getName(), definition);

      return true;
    }

    return false;
  }

  public Definition find(String id) {
    for (int i = table.size()-1; i >= 0; i--){
      Definition def = table.get(i).get(id);
      if (def != null)
        return def;
    }
    return null;
  }

  public Definition findInCurrentScope(String id) {
    return table.get(scope).get(id);
  }
}
