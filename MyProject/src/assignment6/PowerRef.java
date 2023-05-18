package assignment6;

public class PowerRef {
	public static double powerOfTwoNo(int a, int b) {
		System.out.println(a+" Power "+b+" using method ref  = ");
		return Math.pow(a, b);
	}
	public static void main(String args[])  {
		Power po = PowerRef::powerOfTwoNo;
		System.out.println(po.power(3, 3));
	}

}
