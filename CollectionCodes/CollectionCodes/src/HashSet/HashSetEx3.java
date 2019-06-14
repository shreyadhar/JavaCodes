package HashSet;
import java.util.*;

import com.sun.org.apache.bcel.internal.generic.Select;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath.Step;
public class HashSetEx3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hset= new HashSet<String>();
		
		hset.add("ram");
		hset.add("krishna");
		hset.add("seeta");
		hset.add("ravan");
		
		System.out.println("Initial elements: "+hset);
		
		hset.remove("ravan");
		System.out.println("after removing ravan element: "+hset);
		
		
		HashSet<String> hset2=new HashSet<String>();
		hset2.add("kavita");
		hset2.add("kavery");
		System.out.println("the second hset is: "+hset2);
		
		hset.addAll(hset2);
		System.out.println("updated hashset: "+hset);
		
		hset.removeAll(hset2);
		System.out.println(" hashset after removing hset2: "+hset);
		
				hset.clear();
		System.out.println("ultimate hset: "+hset);
		
		
		
		
	}

}
