// xxxValue method Demo
package corejava.fundamentals;

public class Wrapper03 {

	public static void main(String[] args) {
		Integer i = new Integer(150);
		System.out.println(i.byteValue());
		System.out.println(i.shortValue());
		System.out.println(i.floatValue());
		System.out.println(i.longValue());
		
		Character c = new Character('a');
		char c1=c.charValue();
		System.out.println(c1);
		
		Boolean b = new Boolean("true");
		boolean b1=b.booleanValue();
		System.out.println(b1);
	}

}
