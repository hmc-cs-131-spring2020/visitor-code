package stack;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class DoOp extends StackInstr  {
    public Op operator_;
    
    public DoOp(Op operator) {
        operator_ = operator;
    }
    
    public void accept(StackInstrVisitor visitor) {
        visitor.visitDoOp(this);
    }
}
