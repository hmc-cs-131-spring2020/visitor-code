package lambdaTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class Var extends Expr  {
    public String name_;
    
    public Var(String name) {
        name_ = name;
    }
    
    public void accept(ExprVisitor visitor) {
        visitor.visitVar(this);
    }
}
