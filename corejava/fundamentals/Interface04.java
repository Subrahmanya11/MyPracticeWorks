//interface can extend any number of interface
package corejava.fundamentals;
interface A04{
	void m1();
}
interface B04{
	void m2();
}
interface C04 extends A04,B04{
	void m3();
}
class D04 implements C04{
	public void m1() {
		System.out.println("m1");
	}
	public void m2() {
		System.out.println("m2");
	}
	public void m3() {
		System.out.println("m3");
	}
}
public class Interface04 {

	public static void main(String[] args) {
		D04 d= new D04();
		d.m1();
		d.m2();
		d.m3();
	}

}
