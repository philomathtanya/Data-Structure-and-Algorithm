import java.util.Scanner;

public class odd_even_linkedlist_sepration {

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

        public static  void sep(int count)
        {
            int arr[]=new int[count];
            node cur=head;
            while(cur.next.next!=null)
            {

            }



        }
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int t=1;
            int count=0;
            while(t==1) {
                node nn = new node();
                System.out.println("Enter the data for nn: ");
                int val = s.nextInt();
                count++;
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
            sep(count);

        }
    }

