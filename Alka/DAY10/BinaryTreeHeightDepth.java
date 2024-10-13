package Pappu.DAY10;

public class BinaryTreeHeightDepth {

    // Definition of TreeNode class
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // Solution class with maxDepth method
    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    // Test cases and main method
    public static void main(String[] args) {
        BinaryTreeHeightDepth tree = new BinaryTreeHeightDepth();
        Solution solution = tree.new Solution();

        // Test Case 1: Empty Tree (null)
        TreeNode root1 = null;
        System.out.println("Max Depth of Empty Tree: " + solution.maxDepth(root1));  // Expected: 0

        // Test Case 2: Single node tree
        TreeNode root2 = tree.new TreeNode(1);
        System.out.println("Max Depth of Single Node Tree: " + solution.maxDepth(root2));  // Expected: 1

        // Test Case 3: Tree with multiple nodes
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
        System.out.println("Max Depth of Tree with multiple nodes: " + solution.maxDepth(root3));  // Expected: 3

        // Test Case 4: Left-skewed tree
        //       1
        //      /
        //     2
        //    /
        //   3
        TreeNode root4 = tree.new TreeNode(1);
        root4.left = tree.new TreeNode(2);
        root4.left.left = tree.new TreeNode(3);
        System.out.println("Max Depth of Left-Skewed Tree: " + solution.maxDepth(root4));  // Expected: 3

        // Test Case 5: Right-skewed tree
        //   1
        //    \
        //     2
        //      \
        //       3
        TreeNode root5 = tree.new TreeNode(1);
        root5.right = tree.new TreeNode(2);
        root5.right.right = tree.new TreeNode(3);
        System.out.println("Max Depth of Right-Skewed Tree: " + solution.maxDepth(root5));  // Expected: 3

        // Test Case 6: Balanced tree
        //        1
        //       / \
        //      2   3
        //     /     \
        //    4       5
        TreeNode root6 = tree.new TreeNode(1);
        root6.left = tree.new TreeNode(2);
        root6.right = tree.new TreeNode(3);
        root6.left.left = tree.new TreeNode(4);
        root6.right.right = tree.new TreeNode(5);
        System.out.println("Max Depth of Balanced Tree: " + solution.maxDepth(root6));  // Expected: 3
    }
}
