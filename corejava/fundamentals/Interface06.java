package corejava.fundamentals;
class A06{
	A06(){
		System.out.println("Parent");
		System.out.println(this.hashCode());
	}
}
class B06 extends A06{
	B06(){
		System.out.println("Child");
		System.out.println(this.hashCode());
	}
}
public class Interface06 {

	public static void main(String[] args) {
		B06 b= new B06();
		System.out.println(b.hashCode());
	}

}
