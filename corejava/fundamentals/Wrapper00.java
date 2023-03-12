package corejava.fundamentals;

public class Wrapper00 {

	public static void main(String[] args) {
		Integer i1= new Integer(10);
		System.out.println(i1);
		Integer i2= new Integer("20");
		System.out.println(i2);
		Number i3= new Float("105.5");
		System.out.println(i3);
		//Integer i4= new Integer("Ten"); Throws NumberFormatException
		Integer i5= new Integer("20");
		System.out.println(i2==i5);
		
	}

}
