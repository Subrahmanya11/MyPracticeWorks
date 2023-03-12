//AutoBoxing & Auto UnBoxing
package corejava.fundamentals;

public class Wrapper07 {

	public static void main(String[] args) {
		Integer i1 = 10;//AutoBoxing using valueOf() method
	//	Integer i2 = "10"; This is not possible-String and Integer incompatible type
		int i2=i1;//Auto UnBoxing using xxxValue() method
		System.out.println(i1);
		System.out.println(i2);
	}

}
