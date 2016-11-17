package prim;

import visitor.IDeclVisitor;
import visitor.IIDVisitor;

public class Str implements sort.StrPrim, sort.ID, sort.Decl {
    public final String str;

    public Str(String str) {
        this.str = str;
    }

    @Override public String str() {
        return str;
    }

    @Override public void accept(IDeclVisitor visitor) {
        visitor.visit(str);
    }

    @Override public void accept(IIDVisitor visitor) {
        visitor.visit(str);
    }

    @Override public String toString() {
        return str;
    }
}