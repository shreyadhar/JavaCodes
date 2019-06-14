package Map2;
import java.util.*;
public class TreeMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> map= new TreeMap<Integer, String>();
		map.put(1,"AAA");
		map.put(2,"BBB");
		map.put(3,"VVV");
		map.put(4,"AA");
		map.put(5,"FDF");
		map.put(6,"ERER");
		
		for(Map.Entry entry: map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		
		
	}

}
