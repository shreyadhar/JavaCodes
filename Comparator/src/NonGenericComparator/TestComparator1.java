package NonGenericComparator;
import java.util.*;
public class TestComparator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList al= new ArrayList();
		al.add(new Student(105, "radha", 12));
		al.add(new Student(55, "josh",15));
		al.add(new Student(12, "kate",14));
		al.add(new Student(150, "rosy", 19));
		al.add(new Student(45, "tina", 16));
		
		System.out.println("sorting by name");
		Collections.sort(al, new NameComparator());
		Iterator itr= al.iterator();
		while(itr.hasNext())
		{
			Student s= (Student)itr.next();
			System.out.println(s.rollno+" "+s.name+" "+s.age);
			
		}
		
		System.out.println();
		
		System.out.println("sorting by age");
		Collections.sort(al, new AgeComparator());
		Iterator itr1= al.iterator();
		
		while(itr1.hasNext())
		{
			Student s= (Student)itr1.next();
			System.out.println(s.rollno+" "+s.name+" "+s.age);
			
		}
		
		
		
	}

}
