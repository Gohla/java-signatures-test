package visitor;

public interface IDeclVisitor {
    void visit(cons.Property property);

    void visit(cons.Method method);

    void visit(String str);
}
