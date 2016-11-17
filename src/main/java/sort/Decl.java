package sort;

import visitor.IDeclVisitor;

public interface Decl {
    void accept(IDeclVisitor visitor);
}