package WorkAssignment;
import java.util.*;

public class MergeTwoLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		
		list1.add("AAA");
		list1.add("BBB");
		list1.add("CCC");
		list1.add("DDD");
		list1.add("EEE");
		
		System.out.println("first list: " + list1);

		
		List<String> list2 = new ArrayList<String>();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.add("4");
		list2.add("5");
		list2.add("6");
		System.out.println("second list : " + list2);

		
		List<String> mergeList = new ArrayList<String>();
		mergeList.addAll(list1);
		mergeList.addAll(list2);		
		System.out.println("final merged list : " + mergeList);
	
	}
}
