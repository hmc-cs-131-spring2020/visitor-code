package exprTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class BinOp extends Expr  {
    public Op operator_;
    
    public Expr leftOperand_;
    
    public Expr rightOperand_;
    
    public BinOp(Op operator, Expr leftOperand, Expr rightOperand) {
        operator_ = operator;
        leftOperand_ = leftOperand;
        rightOperand_ = rightOperand;
    }
    
    public void accept(ExprVisitor visitor) {
        visitor.visitBinOp(this);
    }
}
