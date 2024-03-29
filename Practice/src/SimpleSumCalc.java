import java.util.*;
public class SimpleSumCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Sum obj = new Sum();
		
		
		System.out.println("Enter a value");
		obj.valueA= scan.nextFloat();
		
		System.out.println("Enter a value");
		obj.valueB= scan.nextFloat();
		
		System.out.println("Sum value is: "+obj.sumofvalues(obj.valueA, obj.valueB));
		
		
		scan.close();
		
		
		

	}

}
