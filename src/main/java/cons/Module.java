package cons;

import java.util.Arrays;
import java.util.List;

import visitor.IModuleVisitor;
import visitor.IStartVisitor;

public class Module implements sort.Module {
    public final sort.ID id;
    public final List<sort.Def> defs;

    public Module(sort.ID id, List<sort.Def> defs) {
        this.id = id;
        this.defs = defs;
    }

    public Module(sort.ID id, sort.Def... defs) {
        this.id = id;
        this.defs = Arrays.asList(defs);
    }

    @Override public void accept(IModuleVisitor visitor) {
        visitor.visit(this);
    }

    @Override public void accept(IStartVisitor visitor) {
        visitor.visit(this);
    }
}