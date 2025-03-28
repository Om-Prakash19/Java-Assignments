/*
 * Question : Given a BST and two nodes x and y in it, find the lowest common ancestor (LCA) of x and y.
The solution should return null if either x or y is not the actual node in the tree.
 */
public class Question5 {
    static class TreeNode {
        int data;
        TreeNode left = null, right = null;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
        int rootVal = root.data;
        int pVal = p.data;
        int qVal = q.data;

        if (pVal > rootVal && qVal > rootVal) {
            return lca(root.right, p, q);
        } else if (pVal < rootVal && qVal < rootVal) {
            return lca(root.left, p, q);
        } else {
            return root;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(12);
        root.left.left.left = new TreeNode(6);
        root.left.left.right = new TreeNode(9);
        root.right.left = new TreeNode(20);
        root.right.right = new TreeNode(30);
        root.right.left.left = new TreeNode(18);
        root.right.left.right = new TreeNode(22);

        System.out.println(lca(root, root.left.left.left, root.left.right).data);
    }
}
