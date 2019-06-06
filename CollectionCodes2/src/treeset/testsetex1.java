package treeset;
import java.util.*;

public class testsetex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> tset=new TreeSet<Integer>();
		tset.add(3434);
		tset.add(345);
		tset.add(232);
		tset.add(453);
		tset.add(765);
			
		System.out.println("tset is: "+ tset);

		System.out.println("Highest Value: "+ tset.pollFirst());
		System.out.println("Lowest Value:"+ tset.pollLast());				
		System.out.println("tset is: "+ tset);
		
	}

}
