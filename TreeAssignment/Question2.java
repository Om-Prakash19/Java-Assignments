
/*
 * Question : Given the root of a binary tree, check if it is a complete binary tree or not. A complete binary
tree is a binary tree in which every level, except possibly the last, is filled, and all nodes are as far
left as possible.
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

    public static boolean isCompleteBinaryTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean end = false;
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current == null) {
                end = true;
            } else {
                if (end) {
                    return false;
                }
                queue.add(current.left);
                queue.add(current.right);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println(isCompleteBinaryTree(root));
    }
}
