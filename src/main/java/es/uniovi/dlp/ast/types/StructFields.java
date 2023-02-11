package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractType;
import es.uniovi.dlp.ast.Type;

public class StructFields extends AbstractType {

    private String name;
    private Type type;

    public StructFields(String name, Type type, int line, int column) {
        super(line, column);
        this.name = name;
        this.type = type;
    }

    public String getName() { return this.name; }

    public Type getType() { return this.type; }

}
