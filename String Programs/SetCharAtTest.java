class SetCharAtTest
{
	public static void main(String args[])
	{
		StringBuffer s= new StringBuffer("java learning");
		System.out.println("original buffer= "+s);
		System.out.println("charAt(0) originally= "+s.charAt(0));
		s.setCharAt(0,'L');
		System.out.println("buffer after changing the first character= "+s);
		s.setLength(5);
		
		System.out.println("buffer after changing the length= "+s);
		System.out.println("charAt(0) after = "+s.charAt(0));

	}
}