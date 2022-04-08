import java.util.Scanner;

public class binary_tree_using_array_input {
    int arr[];
    int lastusedindex;

    public binary_tree_using_array_input(int size) {
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

    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
        binary_tree_using_array_input obj = new binary_tree_using_array_input(7);
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
        System.out.println("\nPreorder: ");
        obj.preorder(1);
}}