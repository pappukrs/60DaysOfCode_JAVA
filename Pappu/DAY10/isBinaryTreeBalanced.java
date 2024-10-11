package Pappu.DAY10;

public class isBinaryTreeBalanced {

    // Definition of TreeNode class
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // Solution class with isBalanced method
    class Solution {
        public boolean isBalanced(TreeNode root) {
            return checkHeight(root) != -1;
        }

        private int checkHeight(TreeNode root) {
            if (root == null) return 0;

            int leftHeight = checkHeight(root.left);
            if (leftHeight == -1) return -1;

            int rightHeight = checkHeight(root.right);
            if (rightHeight == -1) return -1;

            if (Math.abs(leftHeight - rightHeight) > 1) return -1;

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    // Main method to run test cases
    public static void main(String[] args) {
        isBinaryTreeBalanced tree = new isBinaryTreeBalanced();
        Solution solution = tree.new Solution();

        // Test Case 1: Empty tree (null)
        TreeNode root1 = null;
        System.out.println("Is Empty Tree Balanced? " + solution.isBalanced(root1));  // Expected: true

        // Test Case 2: Single node tree
        TreeNode root2 = tree.new TreeNode(1);
        System.out.println("Is Single Node Tree Balanced? " + solution.isBalanced(root2));  // Expected: true

        // Test Case 3: Balanced tree with multiple nodes
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        TreeNode root3 = tree.new TreeNode(1);
        root3.left = tree.new TreeNode(2);
        root3.right = tree.new TreeNode(3);
        root3.left.left = tree.new TreeNode(4);
        root3.left.right = tree.new TreeNode(5);
        System.out.println("Is Balanced Tree (multiple nodes) Balanced? " + solution.isBalanced(root3));  // Expected: true

        // Test Case 4: Left-skewed tree (unbalanced)
        //       1
        //      /
        //     2
        //    /
        //   3
        TreeNode root4 = tree.new TreeNode(1);
        root4.left = tree.new TreeNode(2);
        root4.left.left = tree.new TreeNode(3);
        System.out.println("Is Left-Skewed Tree Balanced? " + solution.isBalanced(root4));  // Expected: false

        // Test Case 5: Right-skewed tree (unbalanced)
        //   1
        //    \
        //     2
        //      \
        //       3
        TreeNode root5 = tree.new TreeNode(1);
        root5.right = tree.new TreeNode(2);
        root5.right.right = tree.new TreeNode(3);
        System.out.println("Is Right-Skewed Tree Balanced? " + solution.isBalanced(root5));  // Expected: false

        // Test Case 6: Unbalanced tree
        //        1
        //       / \
        //      2   3
        //     / 
        //    4   
        //   /
        //  5
        TreeNode root6 = tree.new TreeNode(1);
        root6.left = tree.new TreeNode(2);
        root6.right = tree.new TreeNode(3);
        root6.left.left = tree.new TreeNode(4);
        root6.left.left.left = tree.new TreeNode(5);
        System.out.println("Is Unbalanced Tree Balanced? " + solution.isBalanced(root6));  // Expected: false
    }
}
