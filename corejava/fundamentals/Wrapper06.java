//toString() Demo
package corejava.fundamentals;

public class Wrapper06 {

	public static void main(String[] args) {
		String s1= Integer.toString(10);
		String s2= Boolean.toString(false);
		String s3= Character.toString('@');
		String s4 = Integer.toUnsignedString(5);
		String s5= Integer.toBinaryString(8);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}

}
