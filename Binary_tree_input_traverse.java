import java.util.Scanner;

public class Binary_tree_input_traverse {
    static class Node {
            Node left, right;
            int data;
            public Node(int data) {
                this.data = data;
            }
        }
        static Scanner sc = null;
        public static void main(String[] args) {
            sc = new Scanner(System.in);
            Node root = createTree();
            System.out.println("\nINORDER: ");
            inOrder(root);
            System.out.println("\nPREORDER: ");
            preOrder(root);
            System.out.println("\nPOSTORDER: ");
            postOrder(root);
            System.out.println();
        }
        static Node createTree() {
            Node root = null;
            System.out.println("Enter data: ");
            int data = sc.nextInt();//10
            if(data == -1) return null;
            root = new Node(data);
            System.out.println("Enter left for " + data);
            root.left = createTree();
            System.out.println("Enter right for "+ data);
            root.right = createTree();
            return root;
        }
        static void inOrder(Node root) {
            if(root == null) return;
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        static void preOrder(Node root) {
            if(root == null) return;
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        static void postOrder(Node root) {
            if(root == null) return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }



