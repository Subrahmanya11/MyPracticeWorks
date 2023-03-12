//Constructor reference
package streamApi;
class Sample{
	private String s;
	Sample(String s){
		this.s=s;
		System.out.println("Constructor executed "+s);
	}
}
interface Interf{
	public Sample get(String s);
}
public class StreamAPI01 {

	public static void main(String[] args) {
		//Sample s = new Sample("Sachin");
		Interf i = a -> new Sample(a);
		i.get("From Lambda");	
		System.out.println();
		Interf i1 = Sample :: new;
		i1.get("From Constructor reference");
	}

}
