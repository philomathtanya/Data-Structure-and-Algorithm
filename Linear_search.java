import java.util.Scanner;

public class Linear_search {
    public void search(int arr[],int p)
    {
        int n=arr.length;
        int i = 0;
        for (i = 0; i < n; i++) {
            if(arr[i]==p)
            {
                System.out.println("Element found at position : "+(i+1));
                break;
            }

        }
        if(i==n)
        {
            System.out.println("Element not found in array ");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of element in ana array: ");
        int n=s.nextInt();
        Linear_search obj=new Linear_search();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the element you want to search: ");
        int p=s.nextInt();
       obj. search(arr,p);


    }
}
