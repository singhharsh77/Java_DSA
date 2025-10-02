package JTG;
public class TargetSumBinaryTree {
    // Definition for a binary tree node

    // Function to check if root-to-leaf path equals targetSum
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false; // empty tree

        // Check if leaf node
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        // Recurse on left and right with updated target
        int remainingSum = targetSum - root.val;
        return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
    }

    // Main function to run the program
    public static void main(String[] args) {

        // Build the tree manually
        // Example: root = [5,4,8,11,null,13,4,7,2,null,null,null,1]
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.right = null;

        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;

        System.out.println();
        // Call the function and print result
        boolean result = hasPathSum(root, targetSum);
        System.out.println("Path sum exists? " + result);
                System.out.println();

    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) { 
        this.val = val; 
        this.left = null;
        this.right = null;
    }
}