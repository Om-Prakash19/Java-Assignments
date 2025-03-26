
/*
 * Question :  Given the root of a binary tree, return the spiral level order traversal of its nodes' values. The
solution should consider the binary tree nodes level by level in spiral order, i.e., all nodes present
at level 1 should be processed first from left to right, followed by nodes of level 2 from right to left,
followed by nodes of level 3 from left to right and so on… In other words, odd levels should be
processed from left to right, and even levels should be processed from right to left.

Input :             1
                   /  \
                  2    3
                 /     /  \
                4     5    6
                     /  \
                    7     8
Output : [1,3,2,4,5,6,8,7]
                    
 */
import java.util.*;

public class Question1 {
    static class TreeNode {
        int data;
        TreeNode left = null, right = null;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static List<Integer> spiralLevelTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean isLeftToRight = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (isLeftToRight) {
                    level.add(current.data);
                } else {
                    level.add(0, current.data);
                }

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            result.addAll(level);
            isLeftToRight = !isLeftToRight;
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
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);

        System.out.println(spiralLevelTraversal(root));
    }
}
