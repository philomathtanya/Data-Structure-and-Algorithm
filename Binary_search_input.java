import java.sql.SQLOutput;
import java.util.Scanner;
public class Binary_search_input {
    public void search(int arr[],int p)
    {
        int start=0;
        int end=arr.length-1;
        int index=0;


        while(start<=end)
        {
            int mid=(start+end) /2;
            if(p==arr[mid])
            {
                System.out.println("Element found at position: "+(mid+1));
                index=mid;
                break;
            }
            else if(p<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        if(index==0)
        {
            System.out.println("Element is not present in array!");
        }


    }
    public static void main(String[] args) {
        //Sorted array
        Binary_search_input obj=new Binary_search_input();
        Scanner s=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the sorted array: ");
        for (int i = 0; i < 5; i++) {
            arr[i]=s.nextInt();
        }

        System.out.println("Enter the number:");
        int p=s.nextInt();
        obj.search(arr,p);
    }
}
