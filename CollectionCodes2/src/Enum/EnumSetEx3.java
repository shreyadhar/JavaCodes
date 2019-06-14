package Enum;
import java.util.*;

  
public class EnumSetEx3 {
	public enum Days2 {
		   Monday, Tuesday, Wednesday, Thursday  
		   };  
		   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		  EnumMap<Days2, String> map = new EnumMap<Days2, String>(Days2.class);  
		   map.put(Days2.Monday, "1");  
		   map.put(Days2.Tuesday, "2");  
		   map.put(Days2.Wednesday, "3");  
		   map.put(Days2.Thursday, "4");  
		   
		   
		   for(Map.Entry m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }   
	
	}

}
