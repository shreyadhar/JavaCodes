class ReplaceTest
{
	public static void main(String args[])
	{
		StringBuffer s= new StringBuffer("java stringbuffer is funny.");
		System.out.println("ORIGINAL STRING: "+s);
		s.replace(5,10,"replace()");
		System.out.println("STRING AFTER REPLACEMENT: "+s);

	}
}