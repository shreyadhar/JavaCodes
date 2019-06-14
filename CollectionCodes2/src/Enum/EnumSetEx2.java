package Enum;
import java.util.*;

enum days2{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
public class EnumSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<days2> set1= EnumSet.allOf(days2.class);
	      System.out.println("Week Days:"+set1);  

		
		
		Set<days2> set2= EnumSet.noneOf(days2.class);
	      System.out.println("Week Days:"+set2);  

	
	
	}

}
