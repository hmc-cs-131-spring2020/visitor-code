package lambdaTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class If extends Expr  {
    public Expr cond_;
    
    public Expr whenT_;
    
    public Expr whenF_;
    
    public If(Expr cond, Expr whenT, Expr whenF) {
        cond_ = cond;
        whenT_ = whenT;
        whenF_ = whenF;
    }
    
    public void accept(ExprVisitor visitor) {
        visitor.visitIf(this);
    }
}
