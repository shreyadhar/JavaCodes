package arraylist;
import java.util.*;
public class ArrayListEx2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al= new ArrayList<String>();
		
		System.out.println("Initial size of arraylist= "+al.size());

		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		
		al.add(1,"A2");
		System.out.println("Size of arraylist after addition: "+al.size());
		
		System.out.println("the contents of the array list: "+ al);
		
		al.remove("F");
		al.remove(5);
	
		System.out.println("the size of the arraylist after deletion: "+ al.size());
		System.out.println("Contents of the arraylist: "+al);
		
		al.add(4, "HELLO $");

		System.out.println("Contents of the arraylist after adding 4 elements:"+al);

		al.add(2,"HELLO @");
		System.out.println("Contents of the arraylist after adding 2 elements:"+al);
	}
	

}
