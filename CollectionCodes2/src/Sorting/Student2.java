package Sorting;

public class Student2  implements Comparable<Student2>{

	int rollno;
	String name;
	int age;
	
	Student2(	int rollno,	String name,	int age)
	{

		this.rollno= rollno;
		this.name=name;
		this.age= age;
	}
	
	@Override
	public int compareTo(Student2 o) {
		// TODO Auto-generated method stub
		if(age==o.age)
			return 0;
		else if (age<o.age)
			return 1;
		else return -1;
	}
}
	
	