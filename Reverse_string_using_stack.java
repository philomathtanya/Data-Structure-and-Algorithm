import java.util.Scanner;
import java.util.Stack;

public class Reverse_string_using_stack {
    static String st;
    public void reverse(String st)
    {
    Stack<Character> sk= new Stack<>();
        for (int i = 0; i < st.length(); i++) {
            sk.push(st.charAt(i));
        }
        st="";
    while(!sk.isEmpty())
    {
        st=st+sk.pop();
    }
        System.out.println(st);
    }



    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string: ");
        st=s.next();
        Reverse_string_using_stack obj=new Reverse_string_using_stack();
        System.out.println("Reverse of string is: ");
        obj.reverse(st);

    }

}
