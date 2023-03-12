//valueOf method  Demo
package corejava.fundamentals;

public class Wrapper02 {

	public static void main(String[] args) {
		System.out.println(Character.MAX_RADIX);
		System.out.println(Character.MIN_RADIX);
		Integer i1= Integer.valueOf("100",36);
		System.out.println(i1);
		Character c1= Character.valueOf('a');
		System.out.println(c1);
		Boolean b1= Boolean.valueOf("Love");
		System.out.println(b1);
		String s= String.valueOf(15);
		System.out.println(s);
	}

}
