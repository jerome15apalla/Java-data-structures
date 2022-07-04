import java.util.Scanner;

public class Unordered {

	 
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
	    int arr[] = {2, 6, 4, 10, 8, 1, 9, 5, 3, 7};
	     
	    System.out.print("Search: ");
	    int to_search = input.nextInt();
	    
	     
	    if(unorderedLinearSearch(arr,to_search))
	        System.out.print("FOUND");
	    else
	    	System.out.print("NOT FOUND");
	 
	}
	
	static boolean unorderedLinearSearch(int arr[], int data)
	{
	    boolean found_flag = false;
	     
	    int i;
	    for(i=0;i<arr.length;i++)
	    {
	        if(arr[i] == data)
	        {
	            found_flag = true;
	            break;
	        }
	    }
	     
	    return found_flag;
	}
}
