package qe;

public class NewTest {
	
	private String name;
	
	public NewTest() {
		this("saurav");
		System.out.println("Saurav constructor....");
		
		
	}
	
	public NewTest(String name) {
		
		System.out.println(" constructor....");
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
// this and super will be first line of constructor
	
	//how to call the second constructor
	
	public static void main(String args[]) {
//		NewTest n;
//		n = new NewTest();
		
	}
	

}
