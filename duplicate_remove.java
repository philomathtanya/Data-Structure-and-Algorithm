import java.util.Scanner;

public class duplicate_remove {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();


        }
        int t=0;
       int p=0;
        int arr1[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    t=1;
                    break;
                }
                else
                {
                    t=0;
                }

            }
            if(t==0)
            {
                arr1[p++]=arr[i];

            }

        }
        for (int i = 0; i < p; i++) {
            System.out.println(arr1[i]);
        }


    }}