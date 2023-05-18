package assignment6;

public class StringSpaceLambda {

	public static void main(String[] args) {
		StringSpace ss = (s) -> {
			System.out.println("Spaced String using lambda is :");
					
			String sp = new String();
			for(int i=0;i<s.length();i++) {
				sp = sp + s.charAt(i);
				sp = sp + " ";
			}
			return sp;
		};
		System.out.println(ss.stringspace("hello"));

	}

}
