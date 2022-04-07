import java.util.Scanner;

public class Count_number_of_element_in_binary_tree {
    static class node
    {
        int data;
        node right;
        node left;
        public node(int data)
        {
            this.data=data;
        }
    }
    static node  create()
    {
        node root= null;
        System.out.println("Enter the data: ");
        int data=s.nextInt();
        if(data==-1)
            return null;
        c++;
        root = new node(data);
        System.out.println("Enter the left side: "+root.data);
        root.left=create();
        System.out.println("Enter the right side: "+root.data);
        root.right=create();
        return root;
    }
    static int c=0;
    static Scanner s;
    public static void main(String[] args) {
        s=new Scanner(System.in);
        node root=create();
        System.out.println("Total number of nodes = "+ c);
    }
}

