import java.io.*;
class charArrayReaderTest
{
	public static void main(String args[]) throws IOException
	{
		String str="LEARNING JAVA IS WHAT WE WILL DO TODAY";
		int length=str.length();
		char array[]= new char[length];
		str.getChars(0,length,array,0);
		CharArrayReader text1= new CharArrayReader(array);
		CharArrayReader text2= new CharArrayReader(array,0,13);
		int x;
		System.out.println("text1 is:" );
		while((x=text1.read())!=-1)
			System.out.print((char)x);
		System.out.println();
		System.out.println();
		System.out.println("text2 is:" );
		while((x=text2.read())!=-1)
			System.out.print((char)x);
		System.out.println();
	
	}
	
}