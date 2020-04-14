package lambdaTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class Number extends Value  {
    public Long ival_;
    
    public Number(Long ival) {
        ival_ = ival;
    }
    
    public void accept(ValueVisitor visitor) {
        visitor.visitNumber(this);
    }
}
