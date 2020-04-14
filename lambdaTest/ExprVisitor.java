package lambdaTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public interface ExprVisitor {
    public void visitVar(Var varVal);
    
    public void visitApply(Apply applyVal);
    
    public void visitBinOp(BinOp binOpVal);
    
    public void visitIf(If ifVal);
    
    public void visitExactly(Exactly exactlyVal);
}
