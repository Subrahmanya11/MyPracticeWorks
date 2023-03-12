//doubt: can we create object of abstract class? Ans:No.
//I didn't got clarity on this.
package corejava.fundamentals;
abstract class A07{
	abstract void hardwork();
	public void B07(){
		System.out.println("abstract "+this.hashCode());
	}
}
public class Interface07 {

	public static void main(String[] args) {
		A07 a= new A07() {
			void hardwork() {
				System.out.println("Hard work matters");
			}
		};
		System.out.println("main "+a.hashCode());
	}

}
