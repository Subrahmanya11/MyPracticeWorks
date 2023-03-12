package corejava.fundamentals;

class FirstCode {
	Inside obj = new Inside();
	 /*obj.disp(); Calling the method is a function. 
	 			   It can be taken inside the method only.
	 			   Calling a method at class level shows C.E*/
		public void show() {
			System.out.println("in show");
			obj.disp();
		}
		class Inside {
			public void disp() {
				System.out.println("in display");
			}
		}
	}
	public class InnerClass00 {

		public static void main(String[] args) {
			FirstCode fc = new FirstCode();
			fc.show();
		}
	}
