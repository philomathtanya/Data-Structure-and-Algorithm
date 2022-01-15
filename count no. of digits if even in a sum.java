import java.io.*;
import java.util.*;

public class Solution {

   

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        int n;
       n=s.nextInt();
        int arr[]=new int[n];
       
        int c=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            
        }
        for(int i=0;i<n;i++)
        {
            String num=Integer.toString(arr[i]);
            if(num.length()%2==0)
            {
                c+=1;
            }
        }
        System.out.print(c);
  
    }
}
