import java.sql.SQLOutput;
import java.util.Scanner;

// SinglyQueue implementation basic
public class Singlyqueue_basic {
    int arr[];
    int front,rear;
    Singlyqueue_basic()
    {
    arr=new int[5];
    front=-1;
    rear=-1;
    }
    void traverse()
    {
        if(front==-1 || rear==-1)
        {
            System.out.println("Singly queue is empty!!");
        }
        else
        {
            System.out.println("Hence this is the queue:  ");
            for (int i = front; i < rear; i++) {
                System.out.print(" "+arr[i]);
            }
        }

    }
    void delete()
    {
        if(front==-1)
        {
            System.out.println("Queue is empty!");
        }
        else
        {
            System.out.println("Deleted.........."+arr[front]);

            if(front== rear)
            {
                front=-1;
                rear=-1;
            }
            else if(front<rear)
            {
                front=front+1;
                System.out.println("DATA DELETED!!");
            }
        }


    }
    void insert()
    {
    if(rear==arr.length-1)
    {
        System.out.println("Queue is full!!");
    }
    else
    {
        System.out.println("Enter the data: ");
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        if(front==-1)
        {
            front=0;
        }
        rear=rear+1;
        arr[rear]=data;
        System.out.println("Datat inserted................");

    }
    }
    public static void main(String[] args) {
        Singlyqueue_basic obj=new Singlyqueue_basic();
        while(true){
            System.out.println("\nPress 1 for insert: ");
            System.out.println("Press 2 for delete: ");
            System.out.println("Press 3 for treverse: ");
            System.out.println("Press 4 for exit: ");
            System.out.println("\n Enter your choice: ");
            Scanner s=new Scanner(System.in);
            int choice=s.nextInt();
            switch(choice)
            {
                case 1:
                    obj.insert();
                    break;

                case 2:
                    obj.delete();
                    break;

                case 3:
                    obj.traverse();
                    break;

                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("INCORRECT OPTION SELECTED!!!");
            }
        }

    }
}
