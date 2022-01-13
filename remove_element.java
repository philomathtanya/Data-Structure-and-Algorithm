import java.util.Scanner;

public class remove_element {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = s.nextInt();
        }
        int in = s.nextInt();
        for (int i = in; i < n-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = 0;
        for (int i = 0; i < n - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}
