import java.util.*;
/*Ques:Write a short Java function that takes an array of int values
 as an argument and determines if there is a pair of numbers in
 the array whose product is odd.*/

// Solution:

public class odd_pair {

    public static void main(String[] args) {
        System.out.println("Enter the Size of the array:");
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        System.out.println("Enter the "+n+" elements: ");
        int arr[]=new int [n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("These are the pairs with odd product: ");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n; j++) {
                if((arr[i]*arr[j])%2==1)
                    System.out.println(arr[i]+","+arr[j]);

            }
        }
    }
}
