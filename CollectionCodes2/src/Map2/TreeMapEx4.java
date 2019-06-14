package Map2;
import java.awt.print.Book;
import java.util.*;
public class TreeMapEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Book1> map= new TreeMap<Integer, Book1>();
		
		   Book1 b1=new Book1(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		    Book1 b2=new Book1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		    Book1 b3=new Book1(103,"Operating System","Galvin","Wiley",6);    
		    
		    map.put(2,b2);  
		    map.put(1,b1);  
		    map.put(3,b3);  
		    
		    for(Map.Entry<Integer, Book1> ent: map.entrySet())
		    {
		    	int key= ent.getKey();
		    	Book1  b= ent.getValue();
		    	System.out.println(key+" details ");	
		    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		    	System.out.println();
		    }
		    
		
		
		
	}

}


class Book1 {    
int id;    
String name,author,publisher;    
int quantity;    
public Book1(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}    