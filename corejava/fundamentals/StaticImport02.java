package corejava.fundamentals;
import static java.lang.Byte.*;
import static java.lang.System.out;
public class StaticImport02 {

	public static void main(String[] args) {
		out.println(MIN_VALUE);//MIN_VALUE is static method in wrapper class
		out.println(MAX_VALUE);//MAX_VALUE is static method in wrapper class
	}

}
// if MAX-VALUE /MIN_VALUE present in current directory then that will be given prior preference
/*order is :
 1 Current class static member
 2 Explicit static import
 3 Implicit static import*/
