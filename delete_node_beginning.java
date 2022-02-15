import java.util.Scanner;

public class delete_node_beginning {
    static class Node {
        int data;
        Node next;
    }

    static Node head = null;
    public static void display()
    {

        Node c=head;
       while(c!=null)
       {
           System.out.println(c.data+" ");
           c=c.next;
       }
    }
    public static void delete(){
        head=head.next;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = 1;
        while (t == 1) {

            Node newnode = new Node();
            System.out.println("Enter the data: ");
            int d = s.nextInt();
            newnode.data = d;
            newnode.next = null;
            if(head==null)
            {
                head=newnode;
            }
            else {

                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newnode;
            }
            System.out.println("press 1 enter to input data if no then 0");
            t = s.nextInt();
        }
        System.out.println("Linkedlist: ");
        display();
        delete();
        System.out.println("After deletion : ");
        display();
    }
}
