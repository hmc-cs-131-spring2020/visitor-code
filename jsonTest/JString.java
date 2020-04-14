package jsonTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class JString extends JValue  {
    public String str_;
    
    public JString(String str) {
        str_ = str;
    }
    
    public void accept(JValueVisitor visitor) {
        visitor.visitJString(this);
    }
}
