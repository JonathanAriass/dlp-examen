package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractType;
import es.uniovi.dlp.ast.Type;

public class Array extends AbstractType {

    private int size;
    private Type type;

    public Array(int size, Type type, int line, int column) {
        super(line, column);
        this.size = size;
        this.type = type;
    }

    public int getSize() { return this.size; }

    public Type getType() { return this.type; }

}
