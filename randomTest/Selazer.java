package randomTest;


// This is a generated file.  Do not edit by hand! 

import java.util.Optional;
import java.util.List;
import org.javatuples.*;

public class Selazer extends Foble  {
    public Optional<Boolean> odd_;
    
    public Selazer(Optional<Boolean> odd) {
        odd_ = odd;
    }
    
    public void accept(FobleVisitor visitor) {
        visitor.visitSelazer(this);
    }
}
