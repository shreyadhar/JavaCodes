package Queue;
import java.util.*;

public class ArrayDequeEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> dq= new ArrayDeque<String>();
		dq.add("Java");
		dq.add("C");
		dq.add("Python");
		
		for(String s: dq)
			System.out.println(s);
					
		
		
	}

}
