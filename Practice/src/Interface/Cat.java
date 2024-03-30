package Interface;

public class Cat implements Animal {
	
	String sound;
	public Cat() {
		System.out.println("Animal has sounds");
	}
	

	public void setsound(String sound) {
		// TODO Auto-generated method stub
		
	this.sound = sound;
		
	}

	public void playsound() {
		// TODO Auto-generated method stub
		
		System.out.println(this.sound);
		
	}


	

}
