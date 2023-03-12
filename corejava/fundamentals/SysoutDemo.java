package corejava.fundamentals;

import java.io.PrintStream;
import static java.lang.System.out; //Static import
public class SysoutDemo {

	public static void main(String[] args) {
		PrintStream xyz= System.out;
		xyz.println("Hello World");
		/* class System
		    {
		   	static PrintStream out;
			}
			class PrintStream
			{
				public void println();
			}	
		 
		 */
		out.println("Fun with Hello World");//Static import
		
	}

}
