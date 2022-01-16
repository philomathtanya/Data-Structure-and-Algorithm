//Q. Write a program to input the elements of a two- dimensional array.
// Then from this array, make two arrays one that stores all odd elements
// of the two-dimensional array and the other that stores all even elements
// of the array.
//Note:-  Resulting arrays will be of ArrayList type

//solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class oddeven_arraylist {
    public static void main(String[] args) {
        System.out.println("Enter the 2D array size:");
        Scanner s=new Scanner(System.in);
        int x,y;
        x=s.nextInt();
        y=s.nextInt();
        int l1=0,l2=0;
        int arr[][]=new int[x][y];
        List<Integer> even=new ArrayList<Integer>();
        List<Integer> odd=new ArrayList<Integer>();

//input and loops
        System.out.println("Enter the 2D array:");
        for (int i = 0; i <x; i++) {
            for (int j = 0; j <y; j++) {
                arr[i][j]=s.nextInt();
                if(arr[i][j] %2==0)
                    even.add(arr[i][j]);
                else
                    odd.add(arr[i][j]);
            }
        }
        System.out.println("All even elements in array are:"+even);
        System.out.println("All odd elements in array are:"+odd);
    }
}
