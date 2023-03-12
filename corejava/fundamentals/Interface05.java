package corejava.fundamentals;
interface A05{
	int a=5;
}

public class Interface05 implements A05{

	public static void main(String[] args) {
		// a=20; CE because variables in interface static and final 
		//int a=20; then output will be 20 as local variable shadows instance variable
		System.out.println(a);
	}

}
