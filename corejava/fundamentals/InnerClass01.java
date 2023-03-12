package corejava.fundamentals;
class A{
	public void show() {
		System.out.println("in show");
	}
	static class B{
		public void config() {
			System.out.println("in config");
		}
	}
}
public class InnerClass01 {

	public static void main(String[] args) {
		A objA = new A();
		objA.show();

		A.B objB=new A.B();// When inner class is static
		objB.config();
	
	}
}
