package corejava.fundamentals;
class DemoVar{
	public void m1(int...x) {//m1(int []x)=> default statement in switch
		System.out.println("VarArgs");
	}
	public void m1(int x) {
		System.out.println("int method");
	}
}
public class VarArgs01 {

	public static void main(String[] args) {
		DemoVar d = new DemoVar();
		d.m1();//d.m1(new int[]{})
		d.m1(5);//d.m1(int x)
		d.m1(10,20);//d.m1(new int[]{10,20})
	}
}
