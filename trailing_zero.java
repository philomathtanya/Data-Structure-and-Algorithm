import java.util.Scanner;
public class trailing_zero {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int f=1;

        while(n>0)
        {
            f=f*n;
            n=n-1;

        }
        int c=0;
        while(f>0)
        {
            int r=f%10;
            if(r==0)
            {
                c=c+1;
            }
            f=f/10;

        }
        System.out.print(c);
    }
}
