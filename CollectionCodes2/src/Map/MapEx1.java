package Map;
import java.util.*;

public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map map=new HashMap();
		
		map.put(1,"Vinod");
		map.put(10,"Verma");
		map.put(15,"Sharma");
		map.put(78,"Gupta");
		map.put(26,"Singh");
		
		Set set=map.entrySet();
		Iterator itr= set.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry) itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
				
	    }  
	}

