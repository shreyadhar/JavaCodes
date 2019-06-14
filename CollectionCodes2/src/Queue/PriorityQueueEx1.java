package Queue;
import java.util.*;

public class PriorityQueueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pqueue= new PriorityQueue<String>();
		pqueue.add("denmark");
		pqueue.add("uk");
		pqueue.add("china");
		pqueue.add("bangladesh");
		pqueue.add("norway");
		pqueue.add("india");
		pqueue.add("usa");
		
		
		
		System.out.println("head: peek: "+pqueue.peek());
		System.out.println("queue elements are  after peek: "+pqueue);
		
		System.out.println("head: element: "+pqueue.element());
		
		System.out.println("queue elements are after element: "+pqueue);
		
		System.out.print("iterating the queue elements: ");
		Iterator itr=pqueue.iterator();
		while(itr.hasNext())
			{
				System.out.print(itr.next()+" ");
				
			}
		System.out.println();
		pqueue.remove();
		System.out.println("queue elements are afer remove: "+pqueue);
		pqueue.poll();
		System.out.println("queue elements are after poll: "+pqueue);

		
		
		

	}

}
