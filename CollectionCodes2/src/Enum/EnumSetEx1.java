package Enum;
import java.util.*;

enum days{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
public class EnumSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<days> set= EnumSet.of(days.TUESDAY, days.WEDNESDAY);
		
		
		Set<days> set2= EnumSet.range(days.SUNDAY, days.WEDNESDAY);

		Set<days> set3= EnumSet.range(days.TUESDAY, days.SATURDAY);
		
		Iterator<days> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();

		Iterator<days> itr2 = set2.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		System.out.println();
		Iterator<days> itr3 = set3.iterator();
		while(itr3.hasNext())
		{
			System.out.println(itr3.next());
		}
	}

}
