
/*
 * Question :  Given a binary search tree, find a pair with a given sum present in it.
 */
import java.util.*;

public class Question3 {
    static class TreeNode {
        int data;
        TreeNode left = null, right = null;

        TreeNode(int data) {
            this.data = data;
        }
    }

    static List<Integer> list = new ArrayList<>();

    public static void inorder(TreeNode root) {
        if (root == null)
            return;

        inorder(root.left);
        list.add(root.data);
        inorder(root.right);
    }

    public static boolean findPair(TreeNode root, int sum) {
        inorder(root);
        int low = 0;
        int high = list.size() - 1;

        while (low < high) {
            if (list.get(low) + list.get(high) == sum) {
                return true;
            }
            if (list.get(low) + list.get(high) < sum) {
                low++;
            } else {
                high--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);

        int sum = 33;

        if (findPair(root, sum)) {
            System.out.println("Pair found");
        } else {
            System.out.println("Pair not found");
        }
    }

}
