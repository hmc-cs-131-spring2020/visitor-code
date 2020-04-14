package stack;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class Push extends StackInstr  {
    public Double value_;
    
    public Push(Double value) {
        value_ = value;
    }
    
    public void accept(StackInstrVisitor visitor) {
        visitor.visitPush(this);
    }
}
