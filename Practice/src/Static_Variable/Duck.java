package Static_Variable;

/* Static variable are initialize only once for a class.   */

/* Static variables are shared.
All instances of the same
class share a single copy of
the static variables.
instance variables: 1 per instance
static variables: 1 per class   */

public class Duck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DuckBehavior obj = new DuckBehavior();
		DuckBehavior obj1 = new DuckBehavior();
		DuckBehavior obj2 = new DuckBehavior();
		DuckBehavior obj3 = new DuckBehavior();

	}

}
