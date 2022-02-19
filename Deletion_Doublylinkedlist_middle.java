import java.util.Scanner;

public class Deletion_Doublylinkedlist_middle {

        static class node
        {
            int data;
            node pre;
            node next;

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
                }//last->null
                p.next=nn;
                nn.pre=p;



            }
            System.out.println("Press 1 to Continue & 0 to Exit! ");
            t=s.nextInt();

        }
        Display();//before
        System.out.println("Enter the postion: ");
        int pos=s.nextInt();

        delete(pos);
        Display();
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
    public static void delete(int pos)
        {
            node temp=head;
            int i=1;
            node p=head;
            node x=head;
            while(i<pos-1)//10 20 30 40->3->30
            {

                temp=temp.next;
                i++;
            }
            System.out.println(temp.data);//1 2 3 4 ---3----2
         temp.next=temp.next.next;


        }
    }


