import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        int n;
       n=s.nextInt();
        int arr[]=new int[n];
        int su=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            su=su+arr[i];
            System.out.print(su +" ");
        }
        
        
    }
}
