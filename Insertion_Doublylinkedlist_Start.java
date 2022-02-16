import java.util.Scanner;

public class Insertion_Doublylinkedlist_Start {
static class node
    {
        int data;
        node pre;
        node next;

    }
    static node head=null;

public static void Display()
    {
        System.out.println("Linkedlist =");
        node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=1;
        while(t==1) {
            node nn = new node();
            System.out.println("Enter the data for nn: ");
            int val = s.nextInt();
            nn.data = val;
            nn.next = null;

            if (head == null) {
                nn.pre = null;
                head = nn;
            } else {
                head.pre = nn;
                nn.next = head;
                head = nn;
            }
            System.out.println("Press 1 to Continue & 0 to Exit! ");
            t=s.nextInt();

        }
        Display();

    }
}
