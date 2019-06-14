package Sorting;
import java.util.*;
public class ComparableEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList<Student2> als= new ArrayList<Student2>() ;
		
		als.add(new Student2(101,"Vijay",23));  
		als.add(new Student2(106,"Ajay",27));  
		als.add(new Student2(105,"Jai",21));  
		
		Collections.sort(als);
		for(Student2 st: als)
		{
			System.out.println(st.rollno+" "+st.name+ " "+st.age);
		}
	}

}
