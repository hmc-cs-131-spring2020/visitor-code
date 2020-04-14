package lambdaTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class Apply extends Expr  {
    public Expr fn_;
    
    public Expr arg_;
    
    public Apply(Expr fn, Expr arg) {
        fn_ = fn;
        arg_ = arg;
    }
    
    public void accept(ExprVisitor visitor) {
        visitor.visitApply(this);
    }
}
