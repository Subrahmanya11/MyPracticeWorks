//Anonymous inner class demo
package corejava.fundamentals;
abstract class Computer{
	abstract public void config(); 
}
public class InnerClass03 {

	public static void main(String[] args) {
		Computer obj = new Computer() 
		{
			public void config() {
				System.out.println("OverRidden config method");
			}
		};
		obj.config();
		

	}

}
