package arraylist;

import java.util.*;
public class ArrayListEx3 {

	public static void main(String[] args) {
	
		ArrayList<Integer> alist=new ArrayList<Integer>();
		
		alist.add(1);
		alist.add(13);
		alist.add(12);
		alist.add(51);
		alist.add(71);
		
		System.out.println("the contents of the arraylist are: "+alist);
		
		//getting the array
		Integer[] iarr=new Integer[alist.size()];
		iarr=alist.toArray(iarr);
		
		int sum=0;
		
		for(int i: iarr)
			sum+=i;
		
		System.out.println("the reqd output is: "+sum);
		
	}
}
