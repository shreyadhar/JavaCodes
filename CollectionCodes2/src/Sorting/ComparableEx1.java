package Sorting;
import java.util.*;
public class ComparableEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList<Student1> als= new ArrayList<Student1>() ;
		
		als.add(new Student1(101,"Vijay",23));  
		als.add(new Student1(106,"Ajay",27));  
		als.add(new Student1(105,"Jai",21));  
		
		Collections.sort(als);
		for(Student1 st: als)
		{
			System.out.println(st.rollno+" "+st.name+ " "+st.age);
		}
	}

}
