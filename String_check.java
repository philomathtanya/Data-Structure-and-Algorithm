import java.util.Scanner;

public class String_check {
    public static void  check(String s)
    {
        int c=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            int ch=s.charAt(i);
            if((ch>=65 && ch<=90) || (ch>=97 && ch<=122) || ch==32)
            {
                c=1;
            }
            else
                c=0;
        }

        if(c == 1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
            }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        check(str);

        //System.out.println(n);
    }
}
