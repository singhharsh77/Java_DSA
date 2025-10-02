package JTG;
    // Definition for a binary tree node

// Definition for a binary tree node
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

public class RootEqualsSumExample {

    // Function to check if root value equals sum of its children
    public static boolean checkTree(TreeNode root) {
        if (root == null) return false;

        int leftVal = (root.left != null) ? root.left.val : 0;
        int rightVal = (root.right != null) ? root.right.val : 0;

        return root.val == (leftVal + rightVal);
    }

    public static void main(String[] args) {
        // Build the tree manually
        // Example tree:
        //       10
        //      /  \
        //     8    2
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.right = new TreeNode(2);

        // Call the function and print result
        boolean result = checkTree(root);
        System.out.println();
        System.out.println("Root equals sum of children? " + result);
                System.out.println();

    }
}
