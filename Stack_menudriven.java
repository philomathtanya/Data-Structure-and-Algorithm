import java.util.Scanner;
import java.util.Stack;

public class Stack_menudriven {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        int a=0,t=1;
        while (t==1)
        {
        System.out.println("Welcome to Stack operations:---\n\n");
        System.out.println("Press 1 for push.");
        System.out.println("Press 2 for pop.");
        System.out.println("Press 3 for Status.");
            System.out.println("Press 4 for print Stack.");

    Scanner s=new Scanner(System.in);
    a= s.nextInt();
    switch(a)
        {
            case 1:
            {
                st.push(10);
                st.push(20);
                st.push(30);
                st.push(40);
                st.push(50);
                System.out.println("Value Pushed Sucessfully!!");
            break;
            }
            case 2:
            {
                System.out.println(st.pop());
                System.out.println("One value is poped!");
            break;
            }
            case 3:
            {
                boolean ans=st.isEmpty();
                System.out.println("Stack is empty? "+ans);
            break;
            }
            case 4:
            {
                System.out.println(st);
            }

        }
        System.out.println("\n\n\tPress 1 to continue & 0 for exit!");
  t=s.nextInt();
    }

}}
