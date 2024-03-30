/* This program demonstrate how to use polymorphism using the extend keyword and usage of abstract class  */

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cat Cat_obj = new cat();
		lion lion_obj = new lion();
		
		/* using the cat object i am accessing the animal class function */
		Cat_obj.intro();
		Cat_obj.sounds();
		lion_obj.sounds();
		
		
		

	}

}
