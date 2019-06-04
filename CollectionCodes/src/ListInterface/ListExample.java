package ListInterface;
import java.util.*;
public class ListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1=new ArrayList<String>();
		l1.add("RAM");
		l1.add("SHYAM");
		l1.add("GEETA");
		
		l1.add(1, "SEETA");
		
		System.out.println("Element in  second position: "+l1.get(2));
		
		Iterator itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.print(" "+ itr.next()+" ");
		}
		
		
		
		
	}

}
