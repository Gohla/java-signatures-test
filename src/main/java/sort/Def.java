package sort;

import visitor.IDefVisitor;

public interface Def {
    void accept(IDefVisitor visitor);
}