package arraylist;

import java.util.*;
public class ArrayListEx4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> alist=new ArrayList<String>();
		
		alist.add("AAAA");
		alist.add("BBBBB");
		alist.add("CCCCC");
		alist.add("DDDDD");
		
		//list iterator
        System.out.println("Traversing list through List Iterator:");  
        ListIterator<String> list1= alist.listIterator(alist.size());
        while(list1.hasPrevious())
        {
        	String str=list1.previous();
        	System.out.println(str);
        	
        }
		
       
        System.out.println("Traversing list through for loop");
        for(int i=0; i<alist.size();i++)
        {
        	System.out.println(alist.get(i));
        }
		
	}

}
