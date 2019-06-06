package treeset;
import java.util.*;

public class treesetex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Set<Book> bset= new TreeSet<Book>();
    Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(233,"Operating System","Galvin","Wiley",6);  
    Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
   bset.add(b1);  
   bset.add(b2);  
    bset.add(b3);  
		
    for(Book b:bset)
    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		
	}

}


class Book implements Comparable<Book>
{
		int id;  
		String name,author,publisher;  
		int quantity;  
		public Book(int id, String name, String author, String publisher, int quantity) {  
		    this.id = id;  
		    this.name = name;  
		    this.author = author;  
		    this.publisher = publisher;  
		    this.quantity = quantity;  
	}

	
public int compareTo(Book b)
{
	if(id>b.id)
		return 1;
	
	else if(id<b.id)
		return -1;
	else return 0;
}
}
