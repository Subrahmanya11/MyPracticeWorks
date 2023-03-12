package corejava.fundamentals;
interface ISample{
	void m1();
	void m2();
}
abstract class SampleImpl implements ISample{
	public void m1() {
		System.out.println("m1 implemented in SampleImpl class");
	}
}
class SubSample extends SampleImpl{
	public void m2() {
		System.out.println("m2 implemented in SubSample class");
	}
}


public class Interface01 {

	public static void main(String[] args) {
	SampleImpl	code1 =new SubSample();//Usually We don't prefer this type of object creation(Parent is abstract class)
	ISample	code2 =new SubSample();//We prefer this type of object creation(Parent is Interface)
	code1.m1();
	code1.m2();
	
	code2.m1();
	code2.m2();
	}

}
