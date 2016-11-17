package sort;

import visitor.IIDVisitor;

public interface ID {
    void accept(IIDVisitor visitor);
}