package lambdaTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class Str extends Value  {
    public String sval_;
    
    public Str(String sval) {
        sval_ = sval;
    }
    
    public void accept(ValueVisitor visitor) {
        visitor.visitStr(this);
    }
}
