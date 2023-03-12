//class can implement any number of interfaces
package corejava.fundamentals;
interface A02{
	void m1();
}
interface B02{
	void m2();
}
class AB02 implements A02,B02{
	public void m1(){
		System.out.println("m1");
	}
	public void m2(){
		System.out.println("m2");
	}
}
public class Interface02 {

	public static void main(String[] args) {
		AB02 b= new AB02();
		b.m1();
		b.m2();

	}

}
