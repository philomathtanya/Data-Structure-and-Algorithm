import java.sql.SQLOutput;
import java.util.Scanner;
public class Bouble_sort {
    public void sort(int arr[])
    {
        int n=arr.length;
        int temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j]);
            }

    }
    public static void main(String[] args) {
        //Sorted array
        Bouble_sort obj=new Bouble_sort();
        int arr[]={5,4,3,2,1};
        Scanner s=new Scanner(System.in);
        obj.sort(arr);
    }


}
