import java.util.Scanner;

public class last_occurrence_recursion_array {

        public static int search(int arr[],int n,int a){
            if(arr[n]!=a)
            {
                return search(arr,n-1,a);
            }
            else
                return n;

        }
        public static void main(String[] args) {
            int n;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the number of elements in array: ");
            n=s.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements: ");
            for (int i = 0; i < n ; i++) {
                arr[i]=s.nextInt();
            }
            System.out.println("Enter the element you want to search: ");
            int a=s.nextInt();
            System.out.println(a+" is at index "+search(arr,n-1,a));
        }
    }


