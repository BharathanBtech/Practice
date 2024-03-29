public class BooksTestDrive{
public static void main(String[] args) {
	
	Books[] mybooks = new Books[3];
	
	int x= 0;
	
	mybooks[0] = new Books("Intro to Java","raja");
	mybooks[1] = new Books("Intro to Pega","ramu");
	mybooks[2] = new Books("Intro to Networking","raju");
	
	while(x<3) {
		System.out.println("The book name is "+mybooks[x].BookName +" and it is published by "+mybooks[x].Author);		
		x= x+1;
	}
		

}
}