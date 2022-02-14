import java.util.Scanner;

public class insertion_linkedlist_between_bydata {

        static class Node {
            String name;
            Node next;
        }

        static Node head=null;



        public static void main(String[] args) {
            int t = 1;
            Scanner s = new Scanner(System.in);
            while (t == 1) {


                System.out.println("Enter the Name: ");

                Node nn = new Node();

                String data = s.next();
                nn.name = data;
                nn.next = null;
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
                t = s.nextInt();
            }

            System.out.println(" This is linkedlist Before:  \n");

            Node c = head;
            while (c != null) {
                System.out.println(c.name);
                c = c.next;
            }
            System.out.println("Enter the name after you want to insert:");
            String in = s.next();
            System.out.println("Enter the name you want to insert: ");

            Node nn = new Node();
            String data = s.next();
            nn.name = data;
            nn.next = null;



                Node temp = head;
                while (!(temp.name.equals(in))) {
                    temp = temp.next;


                }
                Node p = temp.next;
                temp.next = nn;
                nn.next = p;
            System.out.println(" This is linkedlist After:  \n");

            c = head;
            while (c != null) {
                System.out.println(c.name);
                c = c.next;
            }

        }
    }















