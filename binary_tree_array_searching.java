import java.util.Scanner;

public class binary_tree_array_searching {

        static int arr[];
        int lastusedindex;

        public binary_tree_array_searching(int size) {
            arr=new int[size+1];
            lastusedindex=0;
        }
        public void insert(int value)
        {
            if(lastusedindex>arr.length-1)
            {
                return;
            }
            else
            {
                arr[lastusedindex +1]=value;
                lastusedindex++;
            }
        }
        public void preorder(int index)
        {
            if(index> lastusedindex)
                return;
            System.out.print(arr[index]+" ");
            preorder(2*index);
            preorder(2*index+1);
        }
        public static int searching(int val)
        {

            for (int i = 1; i <=7 ; i++) {
                if(arr[i]==val) {
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {

            binary_tree_array_searching obj = new binary_tree_array_searching(7);
            obj.insert(23);
            obj.insert(43);
            obj.insert(73);
            obj.insert(53);
            obj.insert(63);
            obj.insert(83);
            obj.insert(93);

            System.out.println("Tree array: ");    for (int i = 1; i <=7; i++) {
                System.out.print(obj.arr[i]+" ");
            }
            Scanner s=new Scanner(System.in);

            System.out.println("\nEnter the searching number: ");
            int n=s.nextInt();
            System.out.println("index= "+ searching(n));
        }}

