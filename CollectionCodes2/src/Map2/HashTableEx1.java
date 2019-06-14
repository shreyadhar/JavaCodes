package Map2;
import java.util.*;

public class HashTableEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> hm= new Hashtable<Integer,String>();
		
		hm.put(101,"KAMAL");
		hm.put(103, "JAYA");
		hm.put(100, "LAIT");
		hm.put(102,"KANTI");
		
		for(Map.Entry entry: hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("Before remove: "+ hm);    
	       hm.remove(102);  
	       System.out.println("After remove: "+ hm);  
		
		
	}

}
