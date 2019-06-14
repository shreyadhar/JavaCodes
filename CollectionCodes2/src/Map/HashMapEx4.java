package Map;
import java.util.*;
public class HashMapEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Books> map= new HashMap<Integer, Books>();
		   Books b1=new Books(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		    Books b2=new Books(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		    Books b3=new Books(103,"Operating System","Galvin","Wiley",6);    
		
		
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		System.out.println("the elements are: "+map);
		System.out.println();
		
		for(Map.Entry m: map.entrySet())  
	     {  
			int key=(int) m.getKey();
	        Books b=(Books) m.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	       // System.out.println(m.getKey()+" "+m.getValue());   
	        System.out.println();
	     }  
		
	}

}


class Books {    
int id;    
String name,author,publisher;    
int quantity;    
public Books(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}  
}
