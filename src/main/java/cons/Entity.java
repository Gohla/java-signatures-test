package cons;

import java.util.Arrays;
import java.util.List;

import visitor.IDefVisitor;

public class Entity implements sort.Def {
    public final sort.ID id;
    public final List<sort.Decl> decls;

    public Entity(sort.ID id, List<sort.Decl> decls) {
        this.id = id;
        this.decls = decls;
    }

    public Entity(sort.ID id, sort.Decl... decls) {
        this.id = id;
        this.decls = Arrays.asList(decls);
    }

    @Override public void accept(IDefVisitor visitor) {
        visitor.visit(this);
    }
}