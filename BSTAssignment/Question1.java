/*
 * Question : Write an iterative program to search for an element in BST. Also construct a sample BST and
try to search for elements in the same.

The for BST is : 15, 10, 20, 8, 12, 16, 25
 */
public class Question1 {
    static class TreeNode {
        int data;
        TreeNode left = null, right = null;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        TreeNode curr = root;
        TreeNode parentNode = null;

        while (curr != null && curr.data != val) {
            parentNode = curr;

            if (val < curr.data) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        return curr;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);

        TreeNode node = searchBST(root, 25);
        if (node != null) {
            System.out.println("Element found in BST");
        } else {
            System.out.println("Element not found in BST");
        }

    }
}
