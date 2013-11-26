import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class Sequence {
	@GuardedBy("this") private int Value;
	
	public synchronized int getNext() {
		return Value ++ ;
	}
}
