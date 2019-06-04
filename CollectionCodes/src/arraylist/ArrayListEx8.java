package arraylist;
import java.util.*;

public class ArrayListEx8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("aaaa");
		al.add("bbbbb");
		al.add("cccc");
		al.add("ddddd");
		al.add("eeeee");
			
		System.out.println("The array list is: "+ al);
		
		al.remove("aaaa");
        System.out.println("After invoking remove(object) method: "+al);   

        al.remove(2);
        System.out.println("The removal of 2nd pos gives list as: "+ al);
		
        
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("XXXX");
        al2.add("YYYYY");
        al2.add("ZZZZZ");
        
        al.addAll(al2);
        System.out.println("updated arraylist: "+al);
        
        al.removeAll(al2);
        System.out.println("removing elements of the second list: "+al);
        
        //removing based on conditions
        
        //al.removeIf(str->str.contains("eeeee"));
        
        al.clear();
        System.out.println("the array list is now: "+al);
	}

}
