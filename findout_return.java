import java.util.Scanner;

public class findout_return {
public static int  ret(int n,int c) {
    if (n != 0) {

        c++;

        return ret(n / 10, c);
    }
    else
        return c;



}

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x;
        System.out.print("Enter the element: ");
        x=s.nextInt();
        int c=0;
        System.out.println("ANSWER: "+ret(x,c));


    }
}

