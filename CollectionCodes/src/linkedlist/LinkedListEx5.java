package linkedlist;
import java.util.*;

public class LinkedListEx5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Book> lb= new LinkedList<Book>();
		
		 Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		 Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		 Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
	
		 lb.add(b1);  
		 lb.add(b2);  
		 lb.add(b3);  

		  for(Book b:lb)
		     System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity); 
	 
	    
		  
	
	}
}





