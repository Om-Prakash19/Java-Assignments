/*
 * Question :  Given a BST, find the inorder predecessor of a given key in it. If the key does not lie in the BST,
return the previous greater node (if any) present in the BST.
 */

public class Question4 {
    static class TreeNode{
        int data;
        TreeNode left = null, right = null;

        TreeNode(int data){
            this.data = data;
        }
    }

    public static TreeNode findPredecessor(TreeNode root,int key){
        TreeNode predecessor = null;
        while(root != null){
            if(root.data == key){
                if(root.left != null){
                    TreeNode temp = root.left;
                    while(temp.right != null){
                        temp = temp.right;
                    }
                    predecessor = temp;
                }
                break;
            }else if(root.data < key){
                predecessor = root;
                root = root.right;
            }else{
                root = root.left;
            }
        }
        return predecessor;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);

        int key = 12;

        TreeNode predecessor = findPredecessor(root,key);

        if(predecessor != null){
            System.out.println("Inorder predecessor of "+key+" is : "+predecessor.data);
        }else{
            System.out.println("No inorder predecessor found for "+key);
        }
    }
}
