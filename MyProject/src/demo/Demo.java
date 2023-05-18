package demo;

public class Demo {
	public static void main(String []args) {
		Calculator cal = (x,y)-> {
			System.out.println("Adding two number....");
			return x+y;
		};
		System.out.println(cal.calculator(3, 4));
		
	}

}
