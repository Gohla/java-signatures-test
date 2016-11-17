package test;

import org.junit.Test;

import cons.Entity;
import cons.Method;
import cons.Module;
import cons.Property;
import cons.StringTy;
import prim.Str;
import sort.Decl;
import sort.Def;
import sort.Start;
import visitor.IDeclVisitor;
import visitor.IDefVisitor;
import visitor.IStartVisitor;
import visitor.ITypeVisitor;

public class SignaturesTest {
    @Test public void test() {
        // @formatter:off
		final Start term = new Module(
		    new Str("person")
		  , new Entity(
		      new Str("Person")
			, new Property(new Str("name"), new StringTy())
			, new Method(new Str("setName"), new StringTy())
			)
	    );
		// @formatter:on

        term.accept(new IStartVisitor() {
            @Override public void visit(Module module) {
                System.out.println("Module: " + module.id);
                for(Def def : module.defs) {
                    def.accept(new IDefVisitor() {
                        @Override public void visit(Entity entity) {
                            System.out.println("  Entity: " + entity.id);
                            for(Decl decl : entity.decls) {
                                decl.accept(new IDeclVisitor() {
                                    @Override public void visit(String str) {
                                        System.out.println("    String: " + str);
                                    }

                                    @Override public void visit(Method method) {
                                        System.out.print("    Method: " + method.id);
                                        method.type.accept(new ITypeVisitor() {
                                            @Override public void visit(StringTy stringTy) {
                                                System.out.println(" of type String");
                                            }
                                        });
                                    }

                                    @Override public void visit(Property property) {
                                        System.out.print("    Property: " + property.id);
                                        property.type.accept(new ITypeVisitor() {
                                            @Override public void visit(StringTy stringTy) {
                                                System.out.println(" of type String");
                                            }
                                        });
                                    }
                                });
                            }
                        }
                    });
                }
            }
        });
    }
}
