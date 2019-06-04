package arraylist;
import java.util.*;

public class ArrayListEx10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		
		System.out.println("the array list is: "+al);
		System.out.println("Is Array Empty: "+al.isEmpty());
		al.add("FOOD");
		al.add("MENU");
		al.add("DRINK");
		
		System.out.println("After Insertion");
		System.out.println("the array list is: "+al);

		System.out.println("the array is empty: "+al.isEmpty());
		
		
	}

}
