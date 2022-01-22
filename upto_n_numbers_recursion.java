import java.util.Scanner;

public class upto_n_numbers_recursion {

    public void number(int n,int a) {
        if (n != 0) {
            System.out.print(a+" ");
            number(n-1,a+1);
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        upto_n_numbers_recursion obj=new upto_n_numbers_recursion();
        System.out.print("Enter the element: ");
        n = s.nextInt();
        System.out.println("ANSWER: ");

        obj.number(n,1);

    }
    }