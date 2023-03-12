package corejava.fundamentals;
class DemoVar02{
	public void m1(int ... x) {
		System.out.println(x);//1D array will be printed
		for(int ele:x)
			System.out.println(ele);// passed array elements will be printed
	}
}
public class VarArgs02 {

	public static void main(String... args) {
		DemoVar02 d = new DemoVar02();
		d.m1(new int[] {10,20,30,40});

	}

}
