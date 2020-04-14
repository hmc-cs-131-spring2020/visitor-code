package jsonTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class JNumber extends JValue  {
    public Double value_;
    
    public JNumber(Double value) {
        value_ = value;
    }
    
    public void accept(JValueVisitor visitor) {
        visitor.visitJNumber(this);
    }
}
