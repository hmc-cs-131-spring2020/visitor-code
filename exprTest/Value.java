package exprTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class Value extends Expr  {
    public Long value_;
    
    public Value(Long value) {
        value_ = value;
    }
    
    public void accept(ExprVisitor visitor) {
        visitor.visitValue(this);
    }
}
