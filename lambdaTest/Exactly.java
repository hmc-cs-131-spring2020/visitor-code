package lambdaTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class Exactly extends Expr  {
    public Value value_;
    
    public Exactly(Value value) {
        value_ = value;
    }
    
    public void accept(ExprVisitor visitor) {
        visitor.visitExactly(this);
    }
}
