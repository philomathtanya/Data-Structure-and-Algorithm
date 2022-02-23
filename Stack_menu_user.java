import java.util.Scanner;
import java.util.Stack;

public class Stack_menu_user {


    public static void print(Stack st)
    {
        System.out.println(st);
    }
    public static boolean status(Stack st)
    {
        return st.isEmpty();
    }
    public static Stack push(Stack st,int item)
    {
        Scanner s=new Scanner(System.in);
        st.push(s.nextInt());
//        st.push(20);
//        st.push(30);
//        st.push(40);
//        st.push(50);
        System.out.println("Value Pushed Sucessfully!!");
        return st;

    }
    public static Stack pop(Stack st)
    {
        System.out.println(st.pop());
        System.out.println("One value is poped!");
        return st;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int a=0,t=1;
        while (true)
        {
            System.out.println("Welcome to Stack operations:---\n\n");
            System.out.println("Press 1 for push.");
            System.out.println("Press 2 for pop.");
            System.out.println("Press 3 for Status.");
            System.out.println("Press 4 for print Stack.");
            System.out.println("Press 5 for exit");
            int item=0;
            //  Scanner s=new Scanner(System.in);
            a= s.nextInt();
            switch(a)
            {
                case 1:
                {

                    st=push(st,item);
                    break;
                }
                case 2:
                {
                    st=pop(st);
                    break;
                }
                case 3:
                {
                    boolean ans=status(st);
                    System.out.println("is Stack is empty!"+ans);
                    break;
                }
                case 4:
                {
                    print(st);
                    break;
                }
                case 5:
                    System.exit(0);

            }
        }

    }}
