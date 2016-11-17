package cons;

import visitor.IDeclVisitor;

public class Property implements sort.Decl {
    public final sort.ID id;
    public final sort.Type type;

    public Property(sort.ID id, sort.Type type) {
        this.id = id;
        this.type = type;
    }

    @Override public void accept(IDeclVisitor visitor) {
        visitor.visit(this);
    }
}