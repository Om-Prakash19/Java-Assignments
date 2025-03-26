/*
 * Question :  Given the root of a binary tree, return the reverse level order traversal of its nodes' values. The 
solution should consider the binary tree nodes level by level in bottom-up order from left to right, 
i.e., process all nodes of the last level first, followed by all nodes of the second last level, and so on
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

    public static Deque<Integer> reverseLevelOrder(TreeNode root) {
        Deque<Integer> result = new LinkedList<>();
        if (root == null)
            return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode x = q.poll();
                level.add(x.data);

                if (x.left != null)
                    q.add(x.left);
                if (x.right != null)
                    q.add(x.right);
            }
            for (int i = level.size() - 1; i >= 0; i--) {
                result.addFirst(level.get(i));
            }

        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        System.out.println(reverseLevelOrder(root));

    }
}
