package corejava.fundamentals;
interface Add{
	 int add(int a);
}
interface Sub{
	String sub(String a, int b);
}
public class Lambda01 {

	public static void main(String[] args) {
		Add ad=z-> z-5;// Parenthesis is optional
		System.out.println(ad.add(20));
		Sub sb= (x,y)->x+y;//Parameter type is optional, return statement is optional
		System.out.println(sb.sub("a",10));
	}
}
