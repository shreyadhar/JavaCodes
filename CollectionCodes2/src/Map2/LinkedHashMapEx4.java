package Map2;

import java.util.*;
public class LinkedHashMapEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer, String> hm= new LinkedHashMap<Integer,String>();
		
		hm.put(102, "Mukesh");
		hm.put(101,"Rajesh");
		hm.put(103, "Suresh");
		
		
		System.out.println("Keys: "+hm.keySet());
		System.out.println("Values: "+hm.values());
		System.out.println("Key-value pairs: "+hm.entrySet());
		
		
	}

}
