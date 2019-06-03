package WorkAssignment;
import java.util.*;

public class CopyArrayListToAnother {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arrayList1 = new ArrayList<String>();
	    arrayList1.add("Apple");
	    arrayList1.add("Banana");
	    arrayList1.add("Mango");
	    arrayList1.add("Orange");

	    ArrayList<String> arrayList2 = new ArrayList<String>();

	    for(String str: arrayList1)
	    {
	    	arrayList2.add(str);
	    }
	    System.out.println(arrayList2);
	  }
}
