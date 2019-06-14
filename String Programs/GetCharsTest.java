class GetCharsTest
{
	public static void main(String args[])
	{
		String s= "THIS IS A NEW SENTENCE";
		int start=17;
		int end=20;
		char[] target= new char[end-start];
		s.getChars(start, end, target,0);
		System.out.println(target);
	}
}