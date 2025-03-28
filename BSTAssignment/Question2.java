/*
 * Question : . Given a BST and a positive number k, find the k'th largest node in the BST.
 */

import java.util.*;

public class Question2 {
    static class TreeNode {
        int data;
        TreeNode left = null, right = null;

        TreeNode(int data) {
            this.data = data;
        }
    }

    static List<Integer> result = new ArrayList<>();

    public static void inorderTraversal(TreeNode root) {
        if (root == null)
            return;

        inorderTraversal(root.left);
        result.add(root.data);
        inorderTraversal(root.right);
    }

    public static int kthLargest(TreeNode root, int k) {
        inorderTraversal(root);

        return result.get(result.size() - k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);

        int k = 2;

        int res = kthLargest(root, 2);

        System.out.println("Kth largest node is : " + res);
    }

}
