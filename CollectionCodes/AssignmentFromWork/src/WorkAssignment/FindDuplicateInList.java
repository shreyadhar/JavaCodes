package WorkAssignment;
import java.util.*;
public class FindDuplicateInList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list1=new ArrayList<Integer>();
		
		list1.add(2);
		list1.add(4);
		list1.add(4);
		list1.add(6);
		list1.add(8);
		list1.add(9);
		list1.add(4);
		list1.add(10);
		list1.add(11);
		list1.add(15);
		list1.add(10);
		
		System.out.println("List with duplicates: "+list1);
	
		Set<Integer> setInt=new HashSet<Integer>();
		setInt.addAll(list1);
		System.out.println("List without duplicates: "+ setInt);
		
		Set<Integer> setInt2=new HashSet<Integer>();
		Set<Integer> setInt3=new HashSet<Integer>();
		
		for(Integer i : list1)
		{
			if(!setInt2.add(i))
			{
				setInt3.add(i);
			}
		}
		System.out.print("The duplicate elements are: "+ setInt3);

		
	
	}
}
