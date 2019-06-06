package treeset;
import java.util.*;

public class testsetex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> tset=new TreeSet<String>();
		tset.add("mango");
		//tset.add("Apple");
		tset.add("nana");
		tset.add("carrot");
		tset.add("zygote");
		
		System.out.println("tset is: "+ tset);

		System.out.println("Highest Value: "+ tset.pollFirst());
		System.out.println("Lowest Value:"+ tset.pollLast());				
		System.out.println("tset is: "+ tset);
		
		
	}

}
