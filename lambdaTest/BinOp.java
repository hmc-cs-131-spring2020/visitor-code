package lambdaTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class BinOp extends Expr  {
    public Expr lhs_;
    
    public Op op_;
    
    public Expr rhs_;
    
    public BinOp(Expr lhs, Op op, Expr rhs) {
        lhs_ = lhs;
        op_ = op;
        rhs_ = rhs;
    }
    
    public void accept(ExprVisitor visitor) {
        visitor.visitBinOp(this);
    }
}
