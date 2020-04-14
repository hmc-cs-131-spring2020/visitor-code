package jsonTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class JArray extends JValue  {
    public List<JValue> listOfJValue_;
    
    public JArray(List<JValue> listOfJValue) {
        listOfJValue_ = listOfJValue;
    }
    
    public void accept(JValueVisitor visitor) {
        visitor.visitJArray(this);
    }
}
