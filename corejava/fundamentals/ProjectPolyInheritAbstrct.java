//Area of different geometric shapes using polymorphism, Inheritance, Abstraction
package corejava.fundamentals;

import java.util.Scanner;

abstract class Shapes{
	double area;
	final double pi=3.142;
	abstract public void input(); 
	abstract public void compute();
	public void disp() {
		System.out.println("Area is "+ area);
	}
	
	
}
class Rectangle extends Shapes{
	double length;
	double breadth;
	public void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length");
		length = sc.nextDouble();
		System.out.println("Enter breadth");
		breadth = sc.nextDouble();
	}
	public void compute() {
		area = length*breadth;
	}
}
class Square extends Shapes{
	double side;
	public void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter side");
		side = sc.nextDouble();
	}
	public void compute() {
		area= side*side;
	}
}
class Circle extends Shapes{
	double radius;
	public void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter radius");
		radius = sc.nextDouble();
	}
	public void compute() {
		area= pi*radius*radius;
	}
}
class Geometry{
	public void disp(Shapes s) {
		s.input();
		s.compute();
		s.disp();
	}
	
}
public class ProjectPolyInheritAbstrct {

	public static void main(String[] args) {
		Rectangle r= new Rectangle();
		Square sq = new Square();
		Circle c = new Circle();
		Geometry g= new Geometry();
		g.disp(r);
		g.disp(sq);
		g.disp(c);
	}

}
