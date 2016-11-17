package sort;

import visitor.IModuleVisitor;

public interface Module extends sort.Start {
    void accept(IModuleVisitor visitor);
}