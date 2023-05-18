package assignment6;

public class StringSpaceRef {
	public static String spaceBetweenChar(String s) {
		System.out.println("Spaced String using method ref is :");
		
		String sp = new String();
		for(int i=0;i<s.length();i++) {
			sp = sp + s.charAt(i);
			sp = sp + " ";
		}
		return sp;
	}

	public static void main(String[] args) {
		StringSpace ss = StringSpaceRef::spaceBetweenChar;
		System.out.println(ss.stringspace("devloper"));

	}

}
