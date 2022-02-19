import java.util.Scanner;

public class Deletion_doublylinkedlist_end {

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
        public static  void delete()
        {
           node temp=head;
           node t=head;
           while(temp.next!=null)

           {
t=temp;
               temp=temp.next;}
           // t=temp.pre;
        t.next=null;

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
                    node p=head;
                    while(p.next!=null)
                    {
                        p=p.next;
                    }
                    p.next=nn;
                    nn.pre=p;



                }
                System.out.println("Press 1 to Continue & 0 to Exit! ");
                t=s.nextInt();

            }
            System.out.println("Before");
            Display();
            delete();
            System.out.println("After");
            Display();
        }
    }



