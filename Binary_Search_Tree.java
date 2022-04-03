import java.util.Scanner;

public class Binary_Search_Tree {

    class node{
        int data;
        node left,right;
    public node(int val)
    {
        data=val;
        left=right=null;
    }
    }
    node root;


    public void insertnode(int data)
    {
        root=insertR(root,data);
    }
    node insertR(node root,int data)
    {
        if(root==null)
        {
            root=new node(data);
            return root;
        }
        if(data<root.data)
            root.left=insertR(root.left,data);
        else if(data>root.data)
            root.right=insertR(root.right,data);
    return root;}
    public int traversal()
        {
            int t=inorder(root);
            return t;
        }
        int c=0;
        public int  inorder(node root) {
        if(root!=null)
        {
            inorder(root.left);
            System.out.println(root.data);
            c=c+root.data;
            inorder(root.right);
        }
        return c;
    }
static boolean t=false ;
    public static  boolean search(node root, int d) {
        if(t==true) {
            return true;
        }
        else

            if (root != null) {
            search(root.left,d);
            if (root.data == d) {
               t=true;
            }
            search(root.right,d);
        }
        return t;
    }
    public static void main(String[] args) {
        Binary_Search_Tree obj=new Binary_Search_Tree();
        obj.insertnode(50);
        obj.insertnode(30);
        obj.insertnode(20);
        obj.insertnode(40);
        obj.insertnode(70);
        obj.insertnode(60);
        obj.insertnode(80);
        int count=obj.traversal();
        System.out.println("Sum of tree is: "+count);
        System.out.println("Enter the data which ypu want to search= ");
        Scanner st=new Scanner(System.in);
        int d=st.nextInt();
        boolean t=search(obj.root ,d);
        System.out.println(t);
    }
}