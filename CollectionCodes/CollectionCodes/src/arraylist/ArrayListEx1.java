package arraylist;

import java.util.*;

public class ArrayListEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		list.add("Ram");
		list.add("Rama");
		list.add("Raman");
		list.add("Ramanava");
		
		//using iterator
		System.out.println("Using Iterator");
		Iterator itr= list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Using for each style loop");
		
		//using for each style loop
		 for(String obj:list)  
			    System.out.println(obj);  
	}

}
