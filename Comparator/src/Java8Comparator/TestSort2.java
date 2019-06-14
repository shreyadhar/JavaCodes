package Java8Comparator;
import java.util.*;

import NonGenericComparator.Student;
public class TestSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ArrayList<Student> al=new ArrayList<Student>();    
		  al.add(new Student(105, "radha", 12));
			al.add(new Student(55, "josh",15));
			al.add(new Student(12, "kate",14));
			al.add(new Student(150, "rosy", 19));
			al.add(new Student(45, "tina", 16));
		
			
			// sort elements based on name
			
			Comparator<Student> cm1=Comparator.comparing(Student::getName);
			Collections.sort(al, cm1);
			  System.out.println("Sorting by Name");  
			   for(Student st: al){  
			     System.out.println(st.rollno+" "+st.name+" "+st.age);  
			     }  
			   
			   
			 //Sorting elements on the basis of age  
			    Comparator<Student> cm2=Comparator.comparing(Student::getAge);  
			Collections.sort(al,cm2);  
			   System.out.println("Sorting by Age");  
			   for(Student st: al){  
			     System.out.println(st.rollno+" "+st.name+" "+st.age);  
			     }    
		
	}

}
