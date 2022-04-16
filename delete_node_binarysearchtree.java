import java.util.Scanner;



public class delete_node_binarysearchtree {
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
    delete_node_binarysearchtree()
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
   public int inorder_successor(node root)
   {
      int temp=root.data;
      while(root.left!=null)
      {
          temp=root.left.data;
          root=root.left;
      }
      return temp;
   }
    public node delete(node root,int t)//6,4
    {
        if(t<root.data)
        {
            root.left=delete(root.left,t);
        }
        else if(t>root.data)
        {
            root.right=delete(root.right,t);
        }
        else
            if(root.left==null)
            {
                node temp=root.right;
                //root=null;
                return temp;
            }
            else if(root.right==null)
            {
                node temp=root.left;
              //  root=null;
                return temp;
            }
            else
            {
                //place the successor value in place of node
             root.data=inorder_successor(root.right);
             //delete the successor value
                root.right=delete(root.right, root.data);

            }
           return root;
    }
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        delete_node_binarysearchtree obj = new delete_node_binarysearchtree();
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
        obj.delete(root, s.nextInt());
        System.out.println("after deletion");
        obj.inorder(root);

    }
}
