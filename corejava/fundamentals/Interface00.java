package corejava.fundamentals;
interface ISimple{
	void m1();
	void m2();
}
class SimpleImpl implements ISimple{
	public void m1() {
		System.out.println("m1");
	}
	public void m2() {
		System.out.println("m2");
	}
}

public class Interface00 {

	public static void main(String[] args) {
		ISimple sample= new SimpleImpl();
		sample.m1();
		sample.m2();
	}

}
