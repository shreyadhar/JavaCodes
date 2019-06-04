package WorkAssignment;

import java.util.*; 
import java.lang.*; 
import java.io.*;  

class Employee 
{ 
    int empId; 
    String name; 
    int salary;
    
    public Employee(int empId, String name, int salary) 
    { 
        this.empId=empId; 
        this.name=name; 
        this.salary=salary; 
    } 
  
    public String toString() 
    { 
        return this.empId+" "+this.name+" "+this.salary; 
    } 
} 


class SortbyId implements Comparator<Employee> 
{ 
    // sort asc via empId
    public int compare(Employee a, Employee b) 
    { 
        return a.empId - b.empId; 
    }
} 
  
class SortbyName implements Comparator<Employee> 
{ 
    // sort asc via Name
    public int compare(Employee a, Employee b) 
    { 
        return a.name.compareTo(b.name); 
    }

} 


public class SortingEmployees {

	    public static void main (String[] args) 
	    { 
	        ArrayList<Employee> ar = new ArrayList<Employee>(); 
	        ar.add(new Employee(111, "ram", 100000)); 
	        ar.add(new Employee(112, "ravi", 250000)); 
	        ar.add(new Employee(113, "shyam", 50000)); 
	  
	        System.out.println("The unsorted employee list is: "); 
	        for(int i=0; i<ar.size(); i++) 
	            System.out.println(ar.get(i)); 
	  
	        Collections.sort(ar, new SortbyId()); 
	  	        System.out.println("Sorted by empId:- "); 
	        for (int i=0; i<ar.size(); i++) 
	            System.out.println(ar.get(i)); 
	  
	        Collections.sort(ar, new SortbyName()); 
	  
	        System.out.println("Sorted by employee name"); 
	        for (int i=0; i<ar.size(); i++) 
	            System.out.println(ar.get(i)); 
	    } 
	} 
