import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Remove_duplicate_using_hashset_array {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of element: ");
        int n=s.nextInt();
    int[] arr=new int[n];
        System.out.println("Enter the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        List<Integer> anslist=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i]))
            {
                anslist.add(arr[i]);
            }
            else {
                set.add(arr[i]);
            }
        }
        System.out.println("Unique elements are: ");
        System.out.println(set);
    }
}
