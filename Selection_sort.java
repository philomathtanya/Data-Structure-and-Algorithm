import java.util.Scanner;

public class Selection_sort {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            if (min != i) {
                int t = arr[i];
                arr[i] = arr[min];
                arr[min] = t;
            }
        }
    }
            void print ( int arr[]){
            int n=arr.length;
                System.out.println("Sorted Array: ");
            for (int i = 0; i < n; i++)
                System.out.print(arr[i]+" ");

        }

        public static void main (String[]args){

            Scanner s = new Scanner(System.in);
            Selection_sort obj = new Selection_sort();
            int arr[] = {5,4,6,3,2,1};
            obj.sort(arr);
            obj.print(arr);
        }
    }
