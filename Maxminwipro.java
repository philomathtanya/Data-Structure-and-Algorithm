import java.util.*;
public class Maxminwipro
{
	public static void main(String[] args)
	{
	    Scanner sc= new Scanner(System.in);   
		int n= sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
		{
		    arr[i]=sc.nextInt();
		}
		
		int min=0;
		for(int i = 1; i < n; i++)
		{
		    int sum=0;
		    for (int j = 0; j < i+1; j++)
		    {
		        sum+=arr[j];
		    }
		    if (sum < min)
		    {
		        min=sum;
		    }
	    }
        System.out.println(min);
	}    
}
