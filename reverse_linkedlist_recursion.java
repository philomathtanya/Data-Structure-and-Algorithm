public class reverse_linkedlist_recursion
{
    public static class node{
        int data;
        node next;}
    public static void  rev(node head)
    {
        if(head.next!=null) {
             rev(head.next);
            System.out.println(head.data);
        } else
            System.out.println(head.data);

    }

    public static node head=null;
    public static node tail=null;
    public static void insert(int n)
    {
        node nn=new node();
        nn.data=n;

        nn.next=null;
        if(head==null)
        {
            head=nn;
            tail=nn;
        }
        else
        {
            tail.next=nn;
            tail=nn;
        }
    }

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        rev(head);
    }
}