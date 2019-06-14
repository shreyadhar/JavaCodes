package Map2;
import java.util.*;
public class TreeMapEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NavigableMap<Integer, String> map= new TreeMap<Integer, String>();
		map.put(1,"AAA");
		map.put(2,"BBB");
		map.put(3,"VVV");
		map.put(4,"AA");
		map.put(5,"FDF");
		map.put(6,"ERER");
//navigable map
		System.out.println("map: "+ map);

		System.out.println("descending map: "+ map.descendingMap());
		
		System.out.println("head map 4 true:"+map.headMap(4, true));

		System.out.println("head map 3 false:"+map.headMap(3, false));

		System.out.println("head map 5:"+map.headMap(5));
		System.out.println("tail map 4 true:"+map.tailMap(4, true));

		System.out.println("tail map 3 false:"+map.tailMap(3, false));

		System.out.println("tail map 5:"+map.tailMap(5));
		

		
		System.out.println("submap map 2true 5 fasle:"+map.subMap(2,true,5,false));
		System.out.println("submap map 2false 5 true:"+map.subMap(2,false,5,true));
		System.out.println("submap map 2false 5 false:"+map.subMap(2,false,5,false));
		System.out.println("submap map 2true 5 true:"+map.subMap(2,true,5,true));
		
		System.out.println("submap map 2 5:"+map.subMap(2,5));
		
		
		
		
		
		
	}

}
