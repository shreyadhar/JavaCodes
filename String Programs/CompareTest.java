class CompareTest
{
	public static void main(String args[])
	{
		String s1="java";
		String s2= new String(s1);
		String s3=s2;
		String s4="0",s5="0";
		System.out.println();
		System.out.println(s1+" s1equalss1 "+ s2 +" is "+ s1.equals(s2));
		System.out.println();

		System.out.println(s1+" s1==s2 "+s2 +" is "+(s1==s2) );
		System.out.println();

		System.out.println(s1+" s1==s1 "+s1 +" is "+(s1==s1) );
		System.out.println();
		
		System.out.println(s2+" s2==s3 "+s3 +" is "+(s2==s3) );
		System.out.println(s2+" s2equalss3 "+ s3 +" is "+ s2.equals(s3));	
		System.out.println();
		
		System.out.println(s3+" s3==s4 "+s4 +" is "+(s3==s4) );
		System.out.println();
		
		System.out.println(s4+" s4==s5 "+s5 +" is "+(s4==s5) );
		System.out.println(s4+" s4equalss5 "+ s5 +" is "+ s4.equals(s5));
		System.out.println();
		
		
	}
}