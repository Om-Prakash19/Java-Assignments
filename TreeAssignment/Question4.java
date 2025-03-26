
/*
 * Question :  Given the root of a binary tree, return the left view of its nodes' values. Assume the left and 
right child of a node makes a 45–degree angle with the parent.
 */
import java.util.*;

public class Question4 {
    static class TreeNode {
        int data;
        TreeNode left = null, right = null;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static List<Integer> leftView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode x = q.poll();

                if (i == 0) {
                    result.add(x.data);
                }

                if (x.left != null) {
                    q.add(x.left);
                }
                if (x.right != null) {
                    q.add(x.right);
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);

        System.out.println(leftView(root));
    }
}
