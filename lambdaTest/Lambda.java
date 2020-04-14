package lambdaTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class Lambda extends Value  {
    public String param_;
    
    public Expr body_;
    
    public Lambda(String param, Expr body) {
        param_ = param;
        body_ = body;
    }
    
    public void accept(ValueVisitor visitor) {
        visitor.visitLambda(this);
    }
}
