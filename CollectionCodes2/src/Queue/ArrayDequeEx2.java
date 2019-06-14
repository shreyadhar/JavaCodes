package Queue;
import java.util.*;

public class ArrayDequeEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> dq= new ArrayDeque<String>();
		dq.offer("Java");
		dq.offer("C");
		dq.add("Python");
		dq.offerFirst("ANDROID");
		System.out.print("After offerfirst traversal: ");
		for(String s: dq)
			System.out.print(s +" ");
					
		dq.poll();
		System.out.println("queue after poll: "+dq);
		dq.pollFirst();

		System.out.println("queue after pollFirst: "+dq);
		dq.pollLast();
		
		System.out.print("After polllast traversal: ");
		for(String s: dq)
		System.out.print(s + " ");		
	}

}
