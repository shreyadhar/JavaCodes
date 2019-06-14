package Sorting;
import java.util.*;
public class TestSortEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		al.add("five");
		al.add("six");

		System.out.println("the arraylist before sorting: "+al);
		
		Collections.sort(al);
		
		System.out.println("the arraylist after sorting: "+al);
		
		Collections.sort(al, Collections.reverseOrder());

		System.out.println("the arraylist after sorting in rev order: "+al);
		
	}

}
