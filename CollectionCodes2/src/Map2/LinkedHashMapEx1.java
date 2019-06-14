package Map2;

import java.util.*;
public class LinkedHashMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer, String> hm= new LinkedHashMap<Integer,String>();
		
		hm.put(102, "Mukesh");
		hm.put(101,"Rajesh");
		hm.put(103, "Suresh");
		
		
		for(Map.Entry m: hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
