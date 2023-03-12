package corejava.fundamentals;
class DemoVar04{
	public void m1(int[][]...k) {
		System.out.println("3D array: "+k);
		for(int[][] ele:k) {
			System.out.println("2D array: "+ele);
			
//		for(int[] xy:ele) {
//				System.out.println("1D array: "+xy);
//				for(int data:xy) {
//					System.out.print(data+" ");
//				}
//				System.out.println();
			for(int i=0; i<ele.length;i++) {
				for(int j=0; j<ele[i].length;j++) {
					System.out.print(ele[i][j]+" ");
				}
				System.out.println();
			}
				
		}
	}
}
public class VarArgs04 {

	public static void main(String[] args) {
		int [][]x= {{10,20,30},{40,50}};
		int [][]y= {{60,70,80},{90,100}};
		DemoVar04 d = new DemoVar04();
		d.m1(x,y);
	}

}
