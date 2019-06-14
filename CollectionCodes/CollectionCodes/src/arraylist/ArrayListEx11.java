package arraylist;
import java.util.*;
public class ArrayListEx11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(100);
		al.add(2324);
		al.add(343);
		al.add(453);
		System.out.println("the arrlist is: "+al);
		System.out.println("before update arrlist: " +al.get(0));
		
		al.set(0, 45103);
		System.out.println("After update arr list: "+ al);
	}

}
