import java.util.Scanner;

public class fibonacci_recursion {
    public int fab(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else if(n==2)
        {
            return 1;
        }
        else
            return fab(n-1)+fab(n-2);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=s.nextInt();
        fibonacci_recursion obj=new fibonacci_recursion();
        System.out.println("the number is: "+obj.fab(n));

    }
}
