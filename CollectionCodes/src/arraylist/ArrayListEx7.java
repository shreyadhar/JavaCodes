package arraylist;
import java.util.*; 
public class ArrayListEx7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al= new ArrayList<String>();
		
		System.out.println("initial list of items: "+ al);
		
		al.add("ram");
		al.add("shyam");
		al.add("sita");
		al.add("gita");
		
		System.out.println("After add(E e) method: "+al);
		
		al.add(3,"radha");
		System.out.println("after adding in 3rd pos: "+al);
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("krishna");
		al2.add("sam");
		
		al.addAll(al2);
		System.out.println("After ading second list to end of the first list: "+al);
		
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("josh");
		al3.add("tina");
		
		al.addAll(2,al3);
		System.out.println("After adding second list in 2nd pos: " +al);
		
		
		
		
	}

}
