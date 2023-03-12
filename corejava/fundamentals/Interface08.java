// Can abstract class contains constructor. ans:Yes
// abstract class constructor will initialize the instance variables of that class 
//which is been used in child class
package corejava.fundamentals;
abstract class PersonA08{ //abstract class with zero abstract method
	String name;
	Integer age;
	Float height;
	
	PersonA08(String name,Integer age,Float height){
		this.name= name;
		this.age= age;
		this.height= height;
	}
}
class StudentB08 extends PersonA08{
	Integer id;
	String course;
	 StudentB08(String name,Integer age,Float height,
			 Integer id,String course){
		 super(name, age,height);
		 this.id=id;
		 this.course=course;
	 }
	 public void getDetail() {
		 System.out.println(name);
		 System.out.println(age);
		 System.out.println(height);
		 System.out.println(id);
		 System.out.println(course);
	 }
}
public class Interface08 {

	public static void main(String[] args) {
		PersonA08 ps =new StudentB08("Human",28,165.5f,10908,"ineuron"); 
		((StudentB08) ps).getDetail();
	}

}
