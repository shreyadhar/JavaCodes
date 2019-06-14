package GenericComparator;
import java.util.*;

import NonGenericComparator.Student;
class NameComparator implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.name.compareTo(s2.name);
	}
	}

class AgeComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.age==o2.age)
		return 0;
		else if(o1.age>o2.age)
			return 1;
		else return  -1;
	}
	}