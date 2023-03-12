package corejava.fundamentals;
class Parent{
	public void cry() {
		System.out.println("p1");
	}
}
class Child1 extends Parent{
public void cry() {
	System.out.println("c1");	
	}
}
class Child2 extends Parent{
public void cry() {
		System.out.println("c2");
	}
public void dance() {
	System.out.println("c2 dances");
}
}
class Child3{
public void cry() {
	System.out.println("c3");
}
	
}	
public class RunTimePolymorphism01 {

	public static void main(String[] args) {
		Child1 c1= new Child1();
		Child2 c2= new Child2();
		//Child3 c3= new Child3();
		Parent ref;
		ref=c1;
		ref.cry();
		ref=c2;
		ref.cry();
		((Child2) ref).dance();//downcasting
		
		/*ref=c3; Type mismatch: ref is parent type and c3 is child3 type. 
		  so child3 cannot be converted to ref as there is no IS-A relationship.
		*/
	}

}
