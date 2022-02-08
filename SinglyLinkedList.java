import java.util.Scanner;
class Node
{
    int rollno;
    Node next;
}
public class SinglyLinkedList 
{
    Node START;
    SinglyLinkedList()
    {
      START = null;
    }
    void insert(){
     System.out.println("insert fn is working");
     System.out.println("Enter your rollno");
     Scanner sc=new Scanner(System.in);
     int data = sc.nextInt();
     
     Node nn=new Node();
     nn.rollno=data;
     nn.next=null;
     
     if(START==null)
     {
         START=nn;
     }
     else
     {
         Node current=START;
         while(current.next!=null)
         {
             current=current.next;
         }
         current.next=nn;
     }
     System.out.println("Data inserted"); 
    }
    void delete()
    {
     System.out.println("delete fn is working");
     if(START==null){
         System.out.println("List emptly");
     }
     else
     {
         System.out.println("deleted.."+START.rollno);
        if(START.next==null)
        {
         START=null;   
        } 
        else
        {
            START=START.next;
        }
     }
    }
    void deleteAll()
    {
      if(START==null)
      {
          System.out.println("List empty");
      }
      else
      {    
          System.out.println("All elements are deletedded");
          START=null;
      }
    }
    void traverse()
    {
     System.out.println("traverse fn is working");
     if(START==null)
     {
         System.out.println("List empty");
     }
     else
     {
         System.out.println("----List element----");
         Node current;
         for(current =START;current !=null;current=current.next){
             System.out.print(" "+current.rollno);
         }
         
     }
    }
    public static void main(String args[]){
    SinglyLinkedList obj = new SinglyLinkedList();
    while(true){
        System.out.println("\n Press 1 for insert");
        System.out.println("Press 2 for delete");
        System.out.println("Press 3 for traverse");
        System.out.println("Press 4 for exit");
        System.out.println("Press 5 for delete all");
        
        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        int choice  = sc.nextInt();
        switch(choice){
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
            case 5:
                obj.deleteAll();
                break;
            default:
                System.out.println("Wrong choice");
            
        }
    }
    }
    
}
