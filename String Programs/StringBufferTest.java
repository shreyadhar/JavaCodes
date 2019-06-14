class StringBufferTest
{
	public static void main(String args[])
	{
		StringBuffer s= new StringBuffer("12");
		System.out.println("buffer= "+s);
		System.out.println("Length= "+s.length());
		System.out.println("Capacity= "+ s.capacity());
	}
}