import java.util.Scanner;

public class binary_search_tree_searching {
    class node
    {
        int data;
        node left;
        node right;
        public node(int d)
        {
            this.data=d;
            left=right=null;
        }
    }
    static node root;
    binary_search_tree_searching()
    {
        root=null;
    }
    public void insert(int data)
    {
        root=insertion(root,data);//(8,16)
    }
    node insertion(node root, int data)
    {
        if(root==null)
        {
            root=new node(data);
            return root;
        }
        if(data<root.data)
        {
            root.left=insertion(root.left,data);
        }
        else if(data>root.data)
        {
            root.right=insertion(root.right,data);
        }
        return root;
    }
    public void inorder(node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);
        }
    }
    static int test=0;
    public int searching(node root,int t)
    {
        if(test==1)
            return test;
        if(root!=null) {
            searching(root.left, t);
            if (root.data == t) {
                test = 1;
            }
            searching(root.right, t);

        }
        return test;
    }
    public static void main(String []args)
    {
        Scanner s =new Scanner(System.in);
        binary_search_tree_searching obj=new binary_search_tree_searching();
        obj.insert(8);
        obj.insert(3);
        obj.insert(1);
        obj.insert(6);
        obj.insert(7);
        obj.insert(10);
        obj.insert(14);
        obj.insert(4);
        System.out.println("inorder traversal");
        obj.inorder(root);
        System.out.println("enter the data to search");
        int n=s.nextInt();
        int k=obj.searching(root,n);
        if(k==1)
        {
            System.out.println("data is found");
        }
        else
        {
            System.out.println("data is not found");
        }
    }


}
