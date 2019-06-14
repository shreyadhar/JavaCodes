//Java Map Example: comparingByKey()

package Map;
import java.util.*;
public class MapEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map= new HashMap<Integer, String>();
		map.put(11,"Radha");
		map.put(155,"Madhu");
		map.put(789,"Bala");
		map.put(112,"Ragina");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out:: println);
System.out.println();
map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out:: println);

		/*
		  //Returns a Set view of the mappings contained in this map        
      map.entrySet()  
      //Returns a sequential Stream with this collection as its source  
      .stream()  
      //Sorted according to the provided Comparator  
      .sorted(Map.Entry.comparingByKey())  
      //Performs an action for each element of this stream  
      .forEach(System.out::println);  
		 * */
	}

}
