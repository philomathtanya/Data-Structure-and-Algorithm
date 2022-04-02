import java.util.Scanner;
import java.math.*;

public class Difference_and_Num {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=s.nextInt();
        }
        int c=0,t;
        int sum=s.nextInt();
        int dif=s.nextInt();
        for (int i = 0; i < arr.length; i++) {

//            if(arr[i]>sum)
//                t=arr[i]-sum;
//            else
//                t=sum-arr[i];

            t=Math.abs(arr[i]-sum);// By using Math.abs() function
           if(t<=dif)
           {
               c++;
           }
        }
        if(c==0)
            System.out.println("-1");
        else
        System.out.println(c);
    }
}
