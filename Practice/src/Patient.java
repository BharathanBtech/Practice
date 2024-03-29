public class Patient {
	
	String Name;
	int Age;
	String Address;
	
	
	public Patient(String Name,int Age,String Address){
		this.Name = Name;
		this.Age = Age;
		this.Address = Address;
	}

	public Patient(){
		this("bharathan",29,"tn");
	}
}
