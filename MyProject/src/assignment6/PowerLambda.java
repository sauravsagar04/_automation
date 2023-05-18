package assignment6;

public class PowerLambda {
	public static void main(String []args) {
		Power po=(x,y) -> {
			System.out.println("Power of x,y using lambda exp is: ");
			return Math.pow(x, y);
		};
		System.out.println(po.power(2, 3));
		
		
	}

}
