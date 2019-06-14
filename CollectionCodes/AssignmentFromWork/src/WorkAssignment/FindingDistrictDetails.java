package WorkAssignment;
import java.util.*;
public class FindingDistrictDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		District d1= new District("kolkata","wb","india");
		District d2= new District("howrah","wb","india");
		District d3= new District("hoogly","wb","india");
		
		State s1= new State("WB", "India");
		State s2= new State("Alaska", "USA");
		
		Country c1= new Country("India");
		Country c2= new Country("Japan");
		
		
//		d1.printDistrict();
	ArrayList<District> darr= new ArrayList<District>();
	
	darr.add(d1);
	darr.add(d2);
	darr.add(d3);
	
ArrayList<State> sarr= new ArrayList<State>();
	
	sarr.add(s1);
	sarr.add(s2);
	
	
ArrayList<Country> carr= new ArrayList<Country>();
	
	carr.add(c1);
	carr.add(c2);
	
		
		System.out.println("enter the district/state/country to know about: ");
		Scanner sc= new Scanner(System.in);
		String searchItem=sc.next();
		sc.close();
		
		for(District d: darr)
		{
			if(d.dname.equalsIgnoreCase(searchItem))
				d.printDistrict();
		}
		for(State s: sarr)
		{
			if(s.sname.equalsIgnoreCase(searchItem) )
				s.printState();
		}
		for(Country c: carr)
		{
			if( c.cname.equalsIgnoreCase(searchItem))
				c.printCountry();
		}
		
		
		
	}

}


class District extends State
{
	String dname;
	District(String d, String s, String c)
	{
		this.dname=d;
		super.sname=s;
		super.cname=c;
	}
	District()
	{
		this.dname=null;	
	}
	
	void printDistrict()
	{
		super.printState();
		System.out.println("District is: "+dname);
	}
	
	
}



class State extends Country
{
	String sname;
	State(String s, String c)
	{
		this.sname=s;
		super.cname=c;
	}
	State()
	{
		this.sname=null;	
	}
	void printState()
	{
		super.printCountry();
		System.out.println("State is: "+sname);
	}
}
	


class Country
{
	String cname;
	Country(String c)
	{
		this.cname=c;	
	}
	Country()
	{
		this.cname=null;	
	}
	
	void printCountry()
	{
		System.out.println("Country is: "+cname);
	}
}