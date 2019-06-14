package linkedlist;
import java.util.*;
public class LinkedListEx4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 LinkedList<String> ll=new LinkedList<String>();  
         ll.add("DBMS");
         ll.add("Software");  
         ll.add("DS");  
         ll.add("Java");  
         ll.add("C");  
         System.out.println("the list is: "+ll );
         
         System.out.print("the reverse list is: ");
         Iterator itr= ll.descendingIterator();
         while(itr.hasNext())
         {
        	 System.out.print(itr.next()+"  ");
         }
	}

}
