package randomTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class Fun extends Widget  {
    public List<String> times_;
    
    public Pair<List<Double>, Optional<Integer>> your_;
    
    public Fun(List<String> times, Pair<List<Double>, Optional<Integer>> your) {
        times_ = times;
        your_ = your;
    }
    
    public void accept(WidgetVisitor visitor) {
        visitor.visitFun(this);
    }
}
