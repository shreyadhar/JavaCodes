package HashSet;
import java.util.*;
public class HashSetEx2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hset=new HashSet<String>();
		
		hset.add("JAI");
		hset.add("RAVI");
		hset.add("KRISHNA");
		hset.add("JAI");
		
		System.out.println("hset is: "+hset);
		
		Iterator<String> itr= hset.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
			
	}

}
