package ListInterface;
import java.util.*;  

public class ListIteratorExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=new ArrayList<String>();
		l1.add("RAM");
		l1.add("SHYAM");
		l1.add("GEETA");
		l1.add(1, "SEETA");		
		
		
        ListIterator<String> itr=l1.listIterator();    
        System.out.println("Traversing elements in forward direction");    
        while(itr.hasNext()){    
              
        System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());    
        }    
        System.out.println("Traversing elements in backward direction");    
        while(itr.hasPrevious()){    
          
        System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());    
        }    
		
	}

}
