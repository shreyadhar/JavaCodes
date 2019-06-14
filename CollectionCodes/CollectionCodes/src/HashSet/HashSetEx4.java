package HashSet;
import java.util.*;
public class HashSetEx4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<String> list=new ArrayList<String>();  
          list.add("Ravi");  
          list.add("Vijay");  
          list.add("Ajay");  
   
          HashSet<String> hset= new HashSet(list);
          hset.add("Jordan");
          
          System.out.println("the hset is: "+hset);
		
		
	}

}
