//class extends class and implements interface 
package corejava.fundamentals;
class A03{
	public void m1() {
		System.out.println("m1");
	}
}
interface B03{
	void m2();
}
class C03 extends A03 implements B03{
	public void  m2() {
		System.out.println("m2");
	}
}
public class Interface03 {

	public static void main(String[] args) {
		A03 ac = new C03();
		ac.m1();
		B03 bc = new C03();
		bc.m2();
	}

}
