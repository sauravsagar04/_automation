package ttn;

public class HelloWorld {
	private static HelloWorld h = new HelloWorld();
	
	
	private HelloWorld( ) {
		System.out.println("Constructor.....");    //singleton class
	}
	
	public static HelloWorld getHelloWorld() {
		return h;
	}
	
	
	
}
