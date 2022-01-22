import java.util.Scanner;

public class x_tothepower_n {
    public int power(int x,int n)
    {
        if(n>0)
        return (x*power(x,n-1));
        else
            return 1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,x;
        x_tothepower_n obj=new x_tothepower_n();
        System.out.print("Enter the element: ");
        x=s.nextInt();
        System.out.print("Enter the power: ");
        n=s.nextInt();
        System.out.println("ANSWER: "+obj.power(x,n));


    }
}
