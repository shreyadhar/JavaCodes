class StringSort
{
	static String name[]={"Sarah","Anne","James","Brad","Emma"};
	
	public static void main(String args[])
	{
	String temp= null;
	
	for(int i=0;i<name.length;i++)
	{
		for(int j=i+1;j<name.length;j++)
		{
			if(name[j].compareTo(name[i])<0)
			{
			temp=name[i];
			name[i]=name[j];
			name[j]=temp;
			}
		}
	}
	for(int i = 0; i<name.length; i++)
	{System.out.println(name[i]);
	}
	}
}