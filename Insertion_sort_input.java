import java.sql.SQLOutput;
import java.util.Scanner;

public class Insertion_sort_input {//4321//3421//3241//2341//2314//2134//1234
    void isort(int arr[])
    {
        for (int i = 1; i <arr.length; i++) {
            int temp=arr[i];
            int a=i-1;
            while(a>-1 && (arr[a]>temp))
            {
                arr[a+1]=arr[a];
                a--;
            }
            arr[a+1]=temp;
        }
    }
    void display(int arr[])
    {
        System.out.println("Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        System.out.println("Enter the array: ");
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i]=s.nextInt();
        }
        Insertion_sort_input obj=new Insertion_sort_input();
        obj.display(arr);
        obj.isort(arr);
        obj.display(arr);
    }
}
