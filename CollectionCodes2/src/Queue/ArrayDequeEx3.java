package Queue;
import java.util.*;
public class ArrayDequeEx3 {
	public static void main(String[] args) {    
	    Deque<Book1> set=new ArrayDeque<Book1>();    
	    //Creating Books    
	    Book1 b1=new Book1(11,"Let us C","Yashwant Kanetkar","BPB",8);    
	    Book1 b2=new Book1(02,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Book1 b3=new Book1(1,"Operating System","Galvin","Wiley",6);    
	    //Adding Books to Deque   
	    set.add(b1);    
	    set.add(b2);    
	    set.add(b3);    
	    //Traversing ArrayDeque  
	    for(Book1 b:set){    
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);    
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