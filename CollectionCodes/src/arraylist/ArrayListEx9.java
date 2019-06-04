package arraylist;
import java.util.*;
public class ArrayListEx9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> alist= new ArrayList<String>();
		alist.add("AAA");
		alist.add("BBB");
		alist.add("CCC");
		alist.add("DDD");
		System.out.println("ArrayList1 : " +alist);
		
		ArrayList<String> alist2= new ArrayList<String>();
		alist2.add("AAA");
		alist2.add("DDD");
		alist2.add("EEE");

		System.out.println("ArrayList2 : " +alist2);

		alist.retainAll(alist2);
	  System.out.println("iterating the elements after retaining the elements of al2");  

	  Iterator itr=alist.iterator();
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
		System.out.println("ArrayList1 : " +alist);

	}

}
