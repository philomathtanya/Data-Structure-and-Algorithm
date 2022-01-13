import java.util.Scanner;

public class inserting_element {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = s.nextInt();
        }
        int in = s.nextInt();
        System.out.println("element;");
        int el=s.nextInt();
        arr[in]=el;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
