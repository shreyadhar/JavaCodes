package Sorting;
import java.util.*;
public class TestSortEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Student> al=new ArrayList<Student>();  
	      al.add(new Student("Viru"));  
	      al.add(new Student("Saurav"));  
	      al.add(new Student("Mukesh"));  
	      al.add(new Student("Tahir")); 
	      
	      System.out.println("before sorting");
	      for(Student s:al)
	      {
	      	System.out.println(s.name);}
	      System.out.println();
		Collections.sort(al);
		System.out.println("after sorting");
for(Student s:al)
{
	System.out.println(s.name);}
System.out.println();
		System.out.println("After reverse sorting");
		Collections.sort(al, Collections.reverseOrder());
		for(Student s:al)
		{
			System.out.println(s.name);}
		
	}

}



class Student implements Comparable<Student>
{
	  public String name;  
	  public Student(String name) {  
	    this.name = name;  
	  }  
	  
	  public int compareTo(Student person)
	  {
		  
		 return name.compareTo(person.name);
	  }
	
	
	}