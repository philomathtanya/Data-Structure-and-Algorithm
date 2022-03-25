import java.sql.SQLOutput;
import java.util.Scanner;

// SinglyQueue implementation basic
public class reverse_queue {
    int arr[];
    int front;
    int rear;
    reverse_queue(int n)
    {


        front=-1;
        rear=-1;
    }



    void traverse(int t)
    {

            System.out.println("Hence this is the queue:  ");
            for (int i = t-1; i >=0; i--) {
                System.out.print(" "+arr[i]);
            }
            for (int i = t; i < arr.length; i++) {
                System.out.print(" "+arr[i]);
            }


    }


    public void insert()
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


        }}

    public static void main(String[] args) {


        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=s.nextInt();


        reverse_queue obj=new reverse_queue(n);
        obj.arr=new int[n];

        for(int i=0;i<n;i++) {
            obj.insert();
        }
        obj.traverse(t);

    }}
