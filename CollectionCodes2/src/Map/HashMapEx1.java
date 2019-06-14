package Map;
import java.util.*;
public class HashMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> hm= new HashMap<Integer, String>();
		System.out.println("Initially the elements are: "+hm);
		
		hm.put(11,"Radha");
		hm.put(155,"Madhu");
		hm.put(789,"Bala");
		hm.put(112,"Radhavi");
		
		System.out.println("After calling the put method: ");
		for(Map.Entry m: hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
		
		
		hm.putIfAbsent(101, "Krishna");
		System.out.println("after invoking putIfAbsent method: ");
		for(Map.Entry m: hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
		
		HashMap<Integer, String> hm2= new HashMap<Integer, String>();
		hm2.put(79,"Baladita");
		hm2.put(12,"Ramesh");
		
		hm.putAll(hm2);
		System.out.println("After calling putAll method: ");
		for(Map.Entry m: hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
		
	}

}
