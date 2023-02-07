package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.Type;

public class IntType implements Type {
    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
