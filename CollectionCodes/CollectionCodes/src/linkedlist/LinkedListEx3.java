package linkedlist;
import java.util.*;

public class LinkedListEx3 {

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
         ll.add("Software");  
         ll.add("DS");  
         ll.add("Software");  
         ll.add("DS");  
         ll.add("Compiler");  
         System.out.println("Initial list of elements: "+ll);
         
         ll.remove("Java");
         System.out.println("After removing java: "+ll);
         
         ll.remove(0);
         System.out.println("After removing index 0: "+ll);
         
         
         LinkedList<String> ll2= new LinkedList<String>();
         ll2.add("Microprocessor");
         ll2.add("Communications");
         System.out.println("ll2 elements: "+ll2);
         
         ll.addAll(ll2);
         System.out.println("updated list adding ll2 elements: "+ll);
         
         ll.removeAll(ll2);
         System.out.println("removing ll2 elements: "+ll);
         
         ll.removeFirst();
         System.out.println("removing the first element: "+ll);
         
         ll.removeLast();
         System.out.println("removing the last element: "+ll);
         
         ll.removeFirstOccurrence("DS");
         System.out.println("removing first occurence of ds: "+ll);

         ll.removeLastOccurrence("Software");
         System.out.println("removing last occurence of software: "+ll);

	
         ll.clear();
         System.out.println("after ll.clear method call: "+ll);
	
	
	}

}
