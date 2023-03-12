package corejava.fundamentals;
interface Launch{
	int getlength(String str);
	
}
public class Lambda2 {

	public static void main(String[] args) {
		Launch l= input->input.length();
		System.out.println(l.getlength("Subrahmanya"));

	}

}
