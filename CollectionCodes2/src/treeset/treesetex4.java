package treeset;
import java.util.*;

public class treesetex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> tset= new TreeSet<String>();
		
		tset.add("A");
		tset.add("C");
		tset.add("B");
		tset.add("G");
		tset.add("E");
		tset.add("D");
		tset.add("F");
		

		System.out.println("Initial set: "+tset);
		
		System.out.println("Reverse set: "+tset.descendingSet());
		
		System.out.println("Head set from b: "+tset.headSet("B"));
		
		System.out.println("Subset bw c and g : "+tset.subSet("C",true, "G",false));
	
		System.out.println("Tail set after d: "+tset.tailSet("D", false));
	
	}

}
