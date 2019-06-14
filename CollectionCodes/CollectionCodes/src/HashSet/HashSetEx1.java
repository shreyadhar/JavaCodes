package HashSet;
import java.util.*;
public class HashSetEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs=new HashSet<String>();
		
		hs.add("10");
		hs.add("9562");
		hs.add("3");
		hs.add("4512");
		hs.add("4578");
		
		Iterator itr= hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
