class DeleteTest
{
	public static void main(String args[])
	{
		StringBuffer s= new StringBuffer("java stringbuffer is funny. and this is a string test");
		System.out.println("ORIGINAL STRING: "+s);
		System.out.println();
			System.out.println();
		s.delete(0,13);
		System.out.println("STRING AFTER DELETING 0-13: "+s);
	System.out.println();	System.out.println();
		s.deleteCharAt(0);
		System.out.println("STRING AFTER DELETING charAt0: "+s);
	System.out.println();	System.out.println();
		
	}
}