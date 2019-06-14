package GenericComparator;
import java.util.*;

import NonGenericComparator.AgeComparator;
import NonGenericComparator.NameComparator;
import NonGenericComparator.Student;
public class TestComparator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> al= new ArrayList<Student>();
		
		al.add(new Student(150, "ross", 19));

		al.add(new Student(105, "celine", 12));
		al.add(new Student(12, "kamal",14));
		al.add(new Student(45, "tania", 16));
		al.add(new Student(55, "julie",15));

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
