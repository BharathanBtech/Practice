
public class SumAndMultiple_Sub {
	private float valueA;
	private float valueB;

	
	public void setvalue(float valueA,float valueB) {
		this.valueA=valueA;
		this.valueB=valueB;				
	}
	
	private float sum() {
		return this.valueA+this.valueB;
	}
	
	private float multiply() {
		return this.valueA*this.valueB;
	}
	
	public void sumofvalues() {
		System.out.println("The sum of 2 value is "+ sum());
	}
	public void multiplyofvalues() {
		System.out.println("The multiply of 2 value is "+ multiply());
	}

}
