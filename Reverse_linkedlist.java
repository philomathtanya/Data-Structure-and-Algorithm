import java.util.Scanner;

public class Reverse_linkedlist {

        static class node
        {
            int data;
            node pre;
            node next;

        }
        static node head=null;
        static node tail=null;

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
        public static  void reverse()
        {

            System.out.println("Reverse linked list is: ");
            node cur=tail;

           while(cur!=null)
           {
               System.out.print(cur.data+" ");
               cur=cur.pre;

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
                    tail=nn;
                } else {
                    node p=head;
                    while(p.next!=null)
                    {
                        p=p.next;
                    }
                    p.next=nn;
                    tail=nn;
                    nn.pre=p;
                }
                System.out.println("Press 1 to Continue & 0 to Exit! ");
                t=s.nextInt();

            }
            System.out.println("Before");
            Display();
            reverse();

        }
    }





