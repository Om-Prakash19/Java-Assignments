
/*
 * Question :  Given the root of a binary tree, convert the binary tree into its mirror and print it’s pre order
 */
import java.util.*;

public class Question5 {
    static class TreeNode {
        int data;
        TreeNode left = null, right = null;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static void mirrorTree(TreeNode root) {
        if (root == null)
            return;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirrorTree(root.left);
        mirrorTree(root.right);

    }

    static List<Integer> result = new ArrayList<>();

    public static List<Integer> preOrder(TreeNode root) {
        helper(root);
        return result;
    }

    public static void helper(TreeNode root) {
        if (root == null)
            return;

        result.add(root.data);
        helper(root.left);
        helper(root.right);

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        mirrorTree(root);
        System.out.println(preOrder(root));
    }
}
