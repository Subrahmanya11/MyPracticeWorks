/*Rules to override a method
 Covarient type relationship
*/
package corejava.fundamentals;

class Interest {

}

class InterestPersonalLoan extends Interest {

}

class Loans {
	public Interest disp() {
		Interest it = new Interest();
		return it;
	}
}

class PersonelLoan extends Loans {
	public InterestPersonalLoan disp() {
		InterestPersonalLoan ipl = new InterestPersonalLoan();
		return ipl;
	}
}

public class Inheritance01 {

	public static void main(String[] args) {

	}

}
