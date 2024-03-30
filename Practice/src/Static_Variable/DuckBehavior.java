package Static_Variable;

public class DuckBehavior {
	
	public static  int duckcount=0;
	
	public DuckBehavior() {
		DuckBehavior.duckcount++;
		printcount();
		
	}
	
	private void printcount()
	{
		System.out.println(duckcount);
	}
	

}
