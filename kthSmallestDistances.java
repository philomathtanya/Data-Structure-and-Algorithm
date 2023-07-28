import java.util.Arrays;
import java.util.Scanner;

public class kthSmallestDistances {

    public static int kthSmallestDistance(int[] swords, int K) {
        int n = swords.length;
        Arrays.sort(swords);

        int left = 0;
        int right = swords[n - 1] - swords[0];

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            int j = 0;

            for (int i = 1; i < n; i++) {
                while (swords[i] - swords[j] > mid) {
                    j++;
                }
                count += i - j;
            }

            if (count < K) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] swords = new int[N];
        for (int i = 0; i < N; i++) {
            swords[i] = scanner.nextInt();
        }
        scanner.close();

        if (K > N * (N - 1) / 2) {
            System.out.println(1);
            return;
        }

        int result = kthSmallestDistance(swords, K);
        System.out.println(result);
    }
}
