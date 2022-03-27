import java.util.Scanner;

public class Rat_Count_House {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int rat=s.nextInt();
        int food =s.nextInt();
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }

        int t=food*rat;
        if(n==0)
            System.out.println("-1");
        int count=0;
        for (int i = 0; i < n; i++) {
            t=t-arr[i];
            count++;
            if(t<=0)
                break;
        }

        if(t>0)
            System.out.println("0");
        else
            System.out.println(count);



    }
}
