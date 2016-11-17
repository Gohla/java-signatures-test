package sort;

import visitor.ITypeVisitor;

public interface Type {
    void accept(ITypeVisitor visitor);
}