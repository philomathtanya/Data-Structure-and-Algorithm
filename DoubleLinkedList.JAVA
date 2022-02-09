import package;
import java.util.Scanner;
class Node2 {
    int rollno;
    Node2 Next;
    Node2 Previous;
    
}
public class DoubleLinkedList{
    Node2 START;
    DoubleLinkedList();
    {
        void insert(){
            System.out.println("enter your rollno");
            Sccanner sc=new Scanner(System.in);
            int data= sc.nextInt();
       Node2 nn= new Node();
       nn.rollno= data;
nn.Next=null;
nn.Previous=null;
     if(START=null){
         START=nn;
     }  
     else
{
    Node2 current = START;
    while(current.Next!=null){
        current=current.Next;
    }
    current.Next=nn;
    nn.Previous=current;
}
System.out.println("data inserted");
        }
        void delete(){
            if(START=null){
                System.out.println("List empty");
            }
            else
{
    System.out.println("deleted :"+ rollno);
    if(START.Next==null){
        START=null;
    }
    else
{
    START= START.Next;
}
        }
        void traverse(){
            if(START=null){
                System.out.println("List empty");
            }
            else{
                Node2 current;
                for(current= START
            System.out.println("current.traverse");
        }
    public static void main(String[] args) {
        DoublyLinkedList= new DoublyLinkedList();
        while(true){
           System.out.println("Press 1 for insert"); 
           System.out.println("Press 2 for delete");
           System.out.println("Press 3 for traverse");
           System.out.println("Press 4 for exit");
           Scanner sc= new Scanner (System.in);
           int choice= sc.nextInt();
           switch(choice){
               case 1:
                   break;
                   case 2:
                       break;
                       case 3:
                           break;
                           case:
                               System.exit(0);
                              default;
                              System.out.println("wrong choice");
           }
        }
