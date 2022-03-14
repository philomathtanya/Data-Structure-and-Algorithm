import java.sql.SQLOutput;
import java.util.Scanner;
public class Binary_search {
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
                System.out.println("Element found at position: "+mid+1);
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
        Binary_search obj=new Binary_search();
        int arr[]={1,2,3,4,5,6,8};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int p=s.nextInt();
        obj.search(arr,p);
    }
}
