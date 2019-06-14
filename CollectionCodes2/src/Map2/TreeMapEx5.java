package Map2;
import java.util.*;
public class TreeMapEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedMap<Integer, String> map= new TreeMap<Integer, String>();
		map.put(1,"AAA");
		map.put(2,"BBB");
		map.put(3,"VVV");
		map.put(4,"AA");
		map.put(5,"FDF");
		map.put(6,"ERER");
		System.out.println("map: "+ map);

		//System.out.println("descending map: "+ map.descendingMap());

		System.out.println();
		System.out.println("head map 4 true:"+map.headMap(4));

		System.out.println("head map 3 false:"+map.headMap(3));

		System.out.println("head map 5:"+map.headMap(5));
		System.out.println();
		System.out.println("tail map 4 true:"+map.tailMap(4));

		
		System.out.println("tail map 3 false:"+map.tailMap(3));

		System.out.println("tail map 5:"+map.tailMap(5));
		

		System.out.println();
		
		System.out.println("submap map 2 5:"+map.subMap(2,5));
		
		
		
		
		
		
	}

}
