package Java8Comparator;
import java.util.*;

import NonGenericComparator.Student;
public class TestSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ArrayList<Student> al=new ArrayList<Student>();    
		  al.add(new Student(105, "radha", 12));
			al.add(new Student(55, "josh",15));
			al.add(new Student(12, "kate",14));
			al.add(new Student(150, "rosy", 19));
			al.add(new Student(45, "tina", 16));
		
			
			Comparator<Student> cm1=Comparator.comparing(Student::getName,Comparator.nullsFirst(String::compareTo));  
			  Collections.sort(al,cm1);  
			  System.out.println("Considers null to be less than non-null");  
			  for(Student st: al){  
			     System.out.println(st.rollno+" "+st.name+" "+st.age);  
			     }  
			  Comparator<Student> cm2=Comparator.comparing(Student::getName,Comparator.nullsLast(String::compareTo));  
			  Collections.sort(al,cm2);  
			  System.out.println("Considers null to be greater than non-null");  
			  for(Student st: al){  
			     System.out.println(st.rollno+" "+st.name+" "+st.age);  
			     }  
		
	}

}
