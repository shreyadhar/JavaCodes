package arraylist;
import java.util.*;
public class ArrayListEx5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student(1,"radha",15);
		Student s2=new Student(2,"shyam",12);
		Student s3=new Student(3,"piya",16);
		Student s4=new Student(4,"madhu",14);
		
		ArrayList<Student> arrStud=new ArrayList<Student>();
		
		arrStud.add(s1);
		arrStud.add(s2);
		arrStud.add(s3);
		arrStud.add(s4);
		
		Iterator arrListItr=arrStud.iterator();
		while(arrListItr.hasNext())
		{
			Student st=(Student) arrListItr.next();
			System.out.println(st.rollno+" "+st.name +" "+st.age);
		}
	}

}
