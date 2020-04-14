package randomTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class Times extends Widget  {
    public Pair<String, Integer> yeah_;
    
    public Times(Pair<String, Integer> yeah) {
        yeah_ = yeah;
    }
    
    public void accept(WidgetVisitor visitor) {
        visitor.visitTimes(this);
    }
}
