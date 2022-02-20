import java.util.Scanner;
import java.util.Stack;
public class Stack_reverse_remove_mid {

        public static void main(String[] args) {
            Stack<Integer> st= new Stack<>();
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the number of element: ");
            int n=s.nextInt();
            int data;
            int arr[]=new int[n];
            System.out.println("Enter the Elements: ");
            for (int i = 0; i < n; i++) {
                data=s.nextInt();
                st.push(data);
            }
            for (int i = 0; i < n; i++) {
                arr[i]=st.pop();
            }
            //middle term
            int p=n/2;

            System.out.println("Output Result: ");
            for (int i = 0; i < n; i++) {
                if(i!=p)
                    System.out.print(arr[i]+" ");
            }
        }
    }

