import java.util.*;

public class SumAndMultiply {

	public static void main(String[] args) {
		/* This program accepts 2 integer value from user, It will give 2 output, one is sum of 2 values, 
		another one is multiple of two values */
		
		float inputvalueA;
		float inputvalueB;
		
		Scanner scan = new Scanner(System.in);
		SumAndMultiple_Sub obj = new SumAndMultiple_Sub();
		
		System.out.println("This function return the sum and multiply of the 2 input value you are providing!");
		
		System.out.println("Provide a input value ");
		inputvalueA= scan.nextFloat();
		
		
		System.out.println("Provide a input value ");
		inputvalueB= scan.nextFloat();
		
		obj.setvalue(inputvalueA, inputvalueB);
		
		obj.sumofvalues();
		obj.multiplyofvalues();
		
		scan.close();	

		
	}

}
