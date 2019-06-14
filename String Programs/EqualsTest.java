class EqualsTest
{
	public static void main(String args[])
	{
		String s1="JAVA";
		String s2="Java";
		String s3="COFFEE";
		String s4="JAVA";
		
		System.out.println(s1+" equals "+ s2 +" is "+s1.equals(s2));
		
		System.out.println(s1+" equals "+ s3 +" is "+s1.equals(s3));
		
		System.out.println(s1+" equals "+ s4 +" is "+s1.equals(s4));
		
		System.out.println(s1+" equals (ignoring case) "+ s2 +" is "+s1.equalsIgnoreCase(s4));
	}
}