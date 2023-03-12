package corejava.fundamentals;
abstract class Plan{
	abstract public void autocadd();
	abstract public void excel();
	public void presentation() {
		System.out.println("PPT Ready");
	}
}
class ResidentialPlan extends Plan{
	public void autocadd() {
		System.out.println("Residential Drawing Ready");
	}
	public void excel() {
		System.out.println("Residential Estimation Ready");
	}
}
class InfrastructurePlan extends Plan{
	public void excel() {
		System.out.println("Infrastructure Estimation Ready");
	}
	public void autocadd() {
		System.out.println("Infrastructure Drawing Ready");
}
}
public class Abstraction {

	public static void main(String[] args) {
		Plan pl1= new ResidentialPlan();
		pl1.autocadd();
		pl1.excel();
		pl1.presentation();//calling inherited method
		Plan pl2= new InfrastructurePlan();
		pl2.autocadd();
		pl2.excel();
		pl2.presentation();// calling inherited method
		
		//Plan p = new Plan();  Cannot instantiate/ object creation not possible for abstract class.
		
		
	}

}
