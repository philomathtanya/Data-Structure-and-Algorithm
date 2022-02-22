import java.util.Scanner;

public class queue_by_linkedlist {
    class Node {
        int data;
        Node next;

    }

    public static Node head = null;
    Node front = null;
    Node rear = null;
    int t = 1;

    public void display() {

        Node temp = front;
        System.out.println("Linkedlist= ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public void enque() {
        Scanner s = new Scanner(System.in);
        while (t == 1) {
            Node nn = new Node();
            System.out.println("Enter the data: ");
            int d = s.nextInt();
            nn.data = d;
            nn.next = null;


            if (front == null && rear == null) {
                front = nn;
                rear = nn;
            } else {
                rear.next = nn;
                rear = nn;
            }
            System.out.println("Press 1 to continue and 0 to exit;");
            t = s.nextInt();
        }
    }

    public void deque() {


        if (front == null) {
            System.out.println("underflow");
        } else {
            System.out.println(front.data + " value deleted");
            front = front.next;
        }


    }

    public static void main(String[] args) {
        queue_by_linkedlist obj = new queue_by_linkedlist();
        Scanner s = new Scanner(System.in);
        // obj.display();
        while (true) {
            System.out.println("\npress 1 to insert ");
            System.out.println("Press 2 to delete");
            System.out.println("Press 3 to display");
            System.out.println("Press 4 to exit");
            int c = s.nextInt();
            switch (c) {
                case 1: {
                    obj.enque();
                    break;
                }
                case 2: {
                    obj.deque();
                    break;
                }
                case 3: {
                    obj.display();
                    break;
                }
                case 4: {
                    System.exit(0);
                }
            }
        }
    }
}