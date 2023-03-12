package corejava.fundamentals;
class DemoVar03
{
	public void m1(int[] ...k) // k should collect 'n'(here n=3) number of arrays of 1 dimension(i.e. int[]x , int[]y & int[]z)
	{
		System.out.println(k);//[[I@... 2D array
		for(int[] ele:k) 
		{
			System.out.println(ele);//[I@... 1D array
		
				for(int xyz:ele) 
				{
					System.out.println(xyz);//Prints data of arrays
				}
		}
	}
}	
public class VarArgs03 {

	public static void main(String[] args) {
		int[] x= {10,20,30};
		int[] y= {40,50};
		int [] z= {60};
		DemoVar03 d = new DemoVar03();
		d.m1(x,y,z);
	}

}
