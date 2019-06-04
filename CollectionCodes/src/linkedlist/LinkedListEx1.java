package linkedlist;
import java.util.*;
public class LinkedListEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Java");
		ll.add("C");
		ll.add("Python");
		ll.add("Fortan");
		
		System.out.print("the list is as follows: ");
		Iterator itr= ll.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
			
		}
		
		
	}

}
