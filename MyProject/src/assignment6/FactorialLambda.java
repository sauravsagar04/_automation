package assignment6;

public class FactorialLambda {
	public static void main(String []args) {
		Factorial f = (a) -> {
			System.out.println("Factorial of "+a+" is : ");
			int ans = 1;
			while(a > 0) {
				ans = ans*a;
				a--;
			}
			return ans;
		};
		System.out.println(f.fact(5));
		
	}
	


}
