package Map;
import java.util.*;
public class MapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> map= new HashMap<Integer, String>();
		map.put(101,"Radha");
		map.put(55,"Madhu");
		map.put(78,"Bala");
		map.put(1012,"Radha");
		
		System.out.println("the map is: "+map);
		for(Map.Entry m: map.entrySet())
		System.out.println(m.getKey()+" "+m.getValue() 	);
		
		
		
	}

}
