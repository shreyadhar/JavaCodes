class TestString
{
	public static void main(String args[])
	{
		char[] a={'J','a','v','a',' ','H','e','l','l','o'};
		String str1=new String(a);
		String str2=new String(str1);
		System.out.println("the first string is: "+str1 );
		System.out.println();
		System.out.println("the second string is: "+str2 );
		
	}
}