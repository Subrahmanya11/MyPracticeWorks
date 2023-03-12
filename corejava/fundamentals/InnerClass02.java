package corejava.fundamentals;
class C{
	public void show() {
		System.out.println("in show");
	}
	 class D{
		public void config() {
			System.out.println("in config");
		}
	}
}
public class InnerClass02 {

	public static void main(String[] args) {
		C objC = new C();
		objC.show();

		C.D objD=objC.new D();// When inner class is Non-static
		objD.config();
	}
}
