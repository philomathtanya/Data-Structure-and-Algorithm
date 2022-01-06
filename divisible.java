import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i]=s.nextInt();
            if((arr[i]%3==0) & (arr[i]%5==0))
            {
                System.out.println(arr[i]);
            }
        }
    }
}
