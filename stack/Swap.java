package stack;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class Swap extends StackInstr  {
    public Swap() {
        
    }
    
    public void accept(StackInstrVisitor visitor) {
        visitor.visitSwap(this);
    }
}
