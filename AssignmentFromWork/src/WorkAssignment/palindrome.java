package WorkAssignment;

import java.util.*;

public class palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=1;
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length()/2;i++ )
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				flag=0;		
			}
		}
		if(flag==1)
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");
	}
}
