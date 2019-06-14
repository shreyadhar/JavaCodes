package Sorting;
import java.util.*;
public class TestSortEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		al.add(10);
		al.add(2);
		al.add(9);
		al.add(15);
		al.add(1);
		al.add(7);

		al.add(Integer.valueOf(201));  
		al.add(Integer.valueOf(101));  
		al.add(230);//internally will be converted into objects as Integer.valueOf(230)  
		  
		System.out.println("the arraylist before sorting: "+al);
		
		Collections.sort(al);
		
		System.out.println("the arraylist after sorting: "+al);
		
		Collections.sort(al, Collections.reverseOrder());

		System.out.println("the arraylist after sorting in rev order: "+al);
		
	}

}
