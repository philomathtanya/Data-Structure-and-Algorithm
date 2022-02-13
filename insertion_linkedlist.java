import java.util.*;

import java.lang.*;

public class insertion_linkedlist {
    static class Node
    {
        int roll;
        Node next;
    }
    static Node head;
    insertion_linkedlist()
    {
        head=null;
    }

    public static void main(String[] args) {
        int t=1;
        while(t==1) {


            System.out.println("Enter the Roll number: ");
            Scanner s = new Scanner(System.in);
            Node nn = new Node();
            int data = s.nextInt();
            nn.roll=data;
            nn.next=null;
            if (head == null) {
                head = nn;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = nn;
            }
            System.out.println("Do you want to add more: (0/1) ");
            t=s.nextInt();
        }
        System.out.println(" This is linkedlist:  \n");

       Node c=head;
       while(c!=null)
       {
           System.out.println(c.roll);
           c=c.next;
       }






        }
    }

