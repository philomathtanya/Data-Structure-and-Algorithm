public class count_nodelinkedlist_recursion {
    public static class node{
        int data;
        node next;
    }

    public static int  count(node t,int c)
    {
        if(t!=null) {
            c++;
          return  count(t.next, c);

        }
       else
        {
            return c;
        }
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
        int c=0;
        System.out.println( count(head,c));
    }
}
