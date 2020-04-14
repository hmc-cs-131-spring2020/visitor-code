package lambdaTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class Boolean extends Value  {
    public Boolean bval_;
    
    public Boolean(Boolean bval) {
        bval_ = bval;
    }
    
    public void accept(ValueVisitor visitor) {
        visitor.visitBoolean(this);
    }
}
