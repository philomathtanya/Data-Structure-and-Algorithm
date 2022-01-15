import java.io.*;
import java.util.*;

public class Solution {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
        int n;
       n=s.nextInt();
        int t;
        t=s.nextInt();
        int t1=0;
         int arr[]=new int[n];
         if(n<t)
        {
            System.out.print("-1");
        }
        else if(n==t)
        {
            for(int i=0;i<n;i++)
            {
                 arr[i]=s.nextInt();
                t1=t1+arr[i];
            }
        System.out.print(t1);
            }
        else
        {
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            
        }
        int sum=0;
     for(int i=0;i<=n-t;i++)
        {
           int mx=0;
            for(int j=i;j<i+t;j++)
            {
                mx=mx+arr[j];
              
            }
          if(mx>sum)
            {
                sum=mx;
            }
        }
       System.out.println(sum);
    }}
}
