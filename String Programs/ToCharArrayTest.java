class ToCharArrayTest
{
	public static void main(String args[])
	{
		String s= "THIS IS A NEW SENTENCE FOR ARRAY TEST";
		char[] target= s.toCharArray();
		System.out.println(target);
		System.out.println();
		byte[] b=s.getBytes();
		System.out.println(b);
				System.out.println();

		String p="hello how are you?";
		byte[] bb=p.getBytes();
		System.out.println(bb);
		System.out.println();
		
	}
}