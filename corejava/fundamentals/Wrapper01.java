// Can we create our own immutable class
// yes we can. Make the class as final and given immutable condition as explained below
package corejava.fundamentals;

final class Wrapper01 //just to avoid inheritance class made as final
{
	
	int i;
	int z;
	Wrapper01(int i)//constructor
	{
		this.i=i;
	}
	public Wrapper01 modify(int z) //method which returns object type
	{
		if (this.i==z)     			// conditions for immutable nature
			return this;
		else
			return new Wrapper01 (z);
	}
	public static void main(String[] args) {
		 Wrapper01 t1= new  Wrapper01(10);
		 Wrapper01 t2= t1.modify(10);//t1. is used to have access for non static method with static reference
		 Wrapper01 t3= t1.modify(100);
		 Wrapper01 t4= t3.modify(100);
		 System.out.println(t1==t2);//true
		 System.out.println(t1==t3);//false
		 System.out.println(t2==t3);//false
		 System.out.println(t4==t3);//true
	}

}
