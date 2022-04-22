import java.util.Scanner;

public class Factorial_recursion {

    public int fact(int n)
    {
        if(n==0)
            return 1;
        else
            return n * fact(n-1);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the value: ");
        Factorial_recursion obj=new Factorial_recursion();
        int n=s.nextInt();
        System.out.println("Factorial: "+obj.fact(n));
    }
}
