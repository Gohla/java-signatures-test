package cons;

import visitor.ITypeVisitor;

public class StringTy implements sort.Type {
    @Override public void accept(ITypeVisitor visitor) {
        visitor.visit(this);
    }
}