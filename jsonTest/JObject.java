package jsonTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class JObject extends JValue  {
    public List<Pair<String, JValue>> listOfJKeyValue_;
    
    public JObject(List<Pair<String, JValue>> listOfJKeyValue) {
        listOfJKeyValue_ = listOfJKeyValue;
    }
    
    public void accept(JValueVisitor visitor) {
        visitor.visitJObject(this);
    }
}
