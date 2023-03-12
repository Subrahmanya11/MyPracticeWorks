package corejava.fundamentals;
abstract class Demo1a{
	abstract public void possible();
	public Demo1a(){
		System.out.println("Hi");
	}
	public Demo1a(int a){
		System.out.println("Bye");
	}
}
class Demo2 extends Demo1a{
	public void possible() {
		System.out.println("We can have constructor in abstract class");
	}
	public Demo2(){
		System.out.println("Hello");
	}
}
public class AbstractionInConstructor {

	public static void main(String[] args) {
		Demo1a d= new Demo2();// However super() method will call parent constructor
		d.possible();
		//d.Demo1a(5); Constructor will not participate in Inheritance so as in abstraction
		

	}

}
