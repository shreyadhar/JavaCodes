package WorkAssignment;
import java.util.*;

public class binarysearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//unsorted array
		int[] arr={98,45,21,78,95,12,45,68,15,32,45,47,78,54,03,80,40,66};
		//enter search item
		System.out.println("Enter the number to search:");
		Scanner sc=new Scanner(System.in);
		int search_item=sc.nextInt();
		sc.close();
		//sorting the array before applying binary search
		//using bubble sort
		arr= sorting_algo(arr);
		
		//binary search
		if(binary_srch(arr, search_item))
		{
			System.out.println("The required item "+search_item+" is present.");
		}
		else
		{
			System.out.println("The required item "+search_item+" is absent.");
		}		
	}
	
	//bubble sorting algo for sorting initial array 
	static int[] sorting_algo(int[] arr)
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		return arr;
				
	}
	
	//binary seach 
	static boolean binary_srch(int[] arr, int reqd)
	{
		int begin = 0, end = arr.length - 1; 
        while (begin <= end) { 
            int mid = begin + (end - begin) / 2; 
            //if item present at mid position 
            if (arr[mid] == reqd) 
                return true; 
            //if item greater, look at right side 
            if (arr[mid] < reqd) 
                begin = mid + 1; 
            //if item smaller, look at left side 
            else
                end = mid - 1; 
        } 
  
        // search item is absent 
        return false; 
	}

}
