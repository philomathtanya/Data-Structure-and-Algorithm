import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class pathsum3 {

    static class Result {
        int maxSum;

        Result(int maxSum) {
            this.maxSum = maxSum;
        }
    }

    static int maxPathSumHelper(TreeNode root, Result result) {
        if (root == null) {
            return 0;
        }

        int leftSum = Math.max(maxPathSumHelper(root.left, result), 0);
        int rightSum = Math.max(maxPathSumHelper(root.right, result), 0);

        int currentPathSum = root.val + leftSum + rightSum;

        result.maxSum = Math.max(result.maxSum, currentPathSum);

        return root.val + Math.max(leftSum, rightSum);
    }

    static int maxPathSum(TreeNode root) {
        Result result = new Result(Integer.MIN_VALUE);
        maxPathSumHelper(root, result);
        return result.maxSum;
    }

    static TreeNode buildTree(int[] nodes, int index) {
        if (index >= nodes.length || nodes[index] == -1) {
            return null;
        }

        TreeNode root = new TreeNode(nodes[index]);
        root.left = buildTree(nodes, 2 * index + 1);
        root.right = buildTree(nodes, 2 * index + 2);

        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nodes = new int[100]; // Assuming input has at most 100 elements, modify if needed
        int n = 0;

        while (scanner.hasNextInt()) {
            nodes[n] = scanner.nextInt();
            n++;
        }
        scanner.close();

        TreeNode root = buildTree(nodes, 0);

        int result = maxPathSum(root);
        System.out.println(result);
    }
}
