import java.util.Scanner;
import java.util.Stack;

public class Stack_by_Array {

    public static void main(String[] args) {
    int arr[]=new int[5];

    Scanner s=new Scanner(System.in);
        Stack <Integer> st=new Stack<>();
        int top;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the data: ");
            arr[i]=s.nextInt();
            st.push(arr[i]);
            top=arr[i];
        }
        System.out.println("Stack is: "+st);

    }
}
