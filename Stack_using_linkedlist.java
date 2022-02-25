import java.util.Scanner;
import java.util.Stack;

public class Stack_using_linkedlist {
    class Node {
        int data;
        Node next = null;
    }

    public static Node head = null;
    int t = 1;
    Node top = null;
    Node ref;

    public void add(Stack st) {
        while (t == 1) {
            Scanner s = new Scanner(System.in);
            Node n = new Node();
            System.out.println("Enter the data: ");
            int d = s.nextInt();
            n.data = d;
            if (top == null) {
                n.next = null;
                top=n;
            } else {
                n.next = ref;
                st.push(n);
                top = n;
            }
            ref = n;
            System.out.println("do you want to continue (1/0)  ");
            t = s.nextInt();
        }
       // System.out.println(top.data);

    }

    public void display() {
        if (top == null) {
            System.out.println("underflow");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public void pop()
    {
        top=top.next;
    }
        public static void main (String[]args){
            Stack_using_linkedlist obj = new Stack_using_linkedlist();
            Stack<Node> st = new Stack<>();
            obj.add(st);
            obj.display();
            obj.pop();
            obj.pop();
            System.out.println("After pop: ");
            obj.display();
        }

}
