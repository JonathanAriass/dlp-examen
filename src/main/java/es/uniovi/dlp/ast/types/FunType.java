package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractType;
import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.definitions.VarDefinition;

public class FunType extends AbstractType {

    private VarDefinition params;
    private Type returnType;

    public FunType(VarDefinition params, Type returnType, int line, int column) {
        super(line, column);
        this.params = params;
        this.returnType = returnType;
    }

    private VarDefinition getParams() { return this.params; }

    private Type getReturnType() { return this.returnType; }

}
