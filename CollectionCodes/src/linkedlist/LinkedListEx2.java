package linkedlist;
import java.util.*;
public class LinkedListEx2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		LinkedList<Integer> ll= new LinkedList<Integer>();

		System.out.println("The initial list of elements: "+ll);
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		System.out.println("after adding elements add(E e): "+ll);
		
		ll.add(1,21);
		System.out.println("After adding a num in 1st pos: "+ll);
	
		
		LinkedList<Integer> ll2= new LinkedList<Integer>();
		ll2.add(10001);
		ll2.add(10002);
		ll2.add(10003);
		ll2.add(10004);
		ll2.add(10005);
		System.out.println("The second linked list is: "+ll2);
		
		
		ll.addAll(ll2);
		System.out.println("The first list after adding second list: "+ll);
		
		
		
		LinkedList<Integer> ll3= new LinkedList<Integer>();
		ll3.add(101);
		ll3.add(102);
		ll3.add(103);
		
		ll.addAll(2,ll3);
		System.out.println("after adding list3 at 2nd pos: "+ll);
	
		ll.addFirst(501);
		System.out.println("adding first element: "+ll);
		
		ll.addLast(1001);
		System.out.println("Adding last element: "+ll);
	
	
	
	}

}
