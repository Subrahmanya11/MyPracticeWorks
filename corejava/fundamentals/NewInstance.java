package corejava.fundamentals;
class Student{
	static {
		System.out.println("student .class file is loading");
	}
	public Student(){
		System.out.println("Constructor is called");
	}
	
	
}
public class NewInstance {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String className= args[0];
		Class c=Class.forName(className);
		Object obj=c.newInstance();
		Student std= (Student) obj;
		System.out.println(std);
		
	}

}
