package Map2;
import java.util.*;

public class HashTableEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> hm= new Hashtable<Integer,String>();
		
		hm.put(101,"KAMAL");
		hm.put(103, "JAYA");
		hm.put(100, "LAIT");
		hm.put(102,"KANTI");
		
		System.out.println(hm.getOrDefault(103,"Cannot find 103"));
		System.out.println(hm.getOrDefault(105,"cannot find 105"));
	
		
		System.out.println();
		System.out.println("initial map: "+hm);
		hm.putIfAbsent(105, "105HATKE");
		System.out.println("updated table with 105: "+hm);
		
		  String x=hm.putIfAbsent(101,"Vijay");  
		     System.out.println("Updated hashtable: "+hm+" the value of x is: "+x);  
	}

}
