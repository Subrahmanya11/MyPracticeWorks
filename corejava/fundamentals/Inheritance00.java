/*Constructor will not participate in inheritance 
 However super() method in child class will call parent class constructor(i.e. Constructor with zero argument)
*/
package corejava.fundamentals;
class Demo{
	int a=5;
	public Demo(int x) {
		System.out.println("Hi");
	}
	public Demo() {
		System.out.println("Hello");
	}
}
class Demo1 extends Demo{
	int b;
	public Demo1() {
		System.out.println(a);
	}
}
public class Inheritance00 {

	public static void main(String[] args) {
	Demo1 d= new Demo1();
	
	}

}
