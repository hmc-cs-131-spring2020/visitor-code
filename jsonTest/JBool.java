package jsonTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class JBool extends JValue  {
    public Boolean state_;
    
    public JBool(Boolean state) {
        state_ = state;
    }
    
    public void accept(JValueVisitor visitor) {
        visitor.visitJBool(this);
    }
}
