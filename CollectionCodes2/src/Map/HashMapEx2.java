package Map;
import java.util.*;
public class HashMapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> hm= new HashMap<Integer, String>();
		System.out.println("Initially the elements are: "+hm);
		
		hm.put(11,"Radha");
		hm.put(155,"Madhu");
		hm.put(789,"Bala");
		hm.put(112,"Radhavi");
		
		System.out.print("After calling the put method: ");
		System.out.println("the elements are: "+hm);

		
		
		hm.remove(112);
		System.out.print("after invoking remove(112) method: ");
		System.out.println("the elements are: "+hm);

		
		hm.remove(789,"Bala");
		System.out.print("After calling remove(k,v) method: ");
		System.out.println(" the elements are: "+hm);

		
	}

}
