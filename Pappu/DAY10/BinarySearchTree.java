package Pappu.DAY10;

public class BinarySearchTree {

    // Definition of TreeNode class
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // Solution class with isValidBST method
    class Solution {
        public boolean isValidBST(TreeNode root) {
            return validate(root, null, null);
        }

        private boolean validate(TreeNode node, Integer low, Integer high) {
            if (node == null) return true;
            if ((low != null && node.val <= low) || (high != null && node.val >= high)) return false;
            return validate(node.left, low, node.val) && validate(node.right, node.val, high);
        }
    }

    // Main method to run test cases
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Solution solution = tree.new Solution();

        // Test Case 1: Empty tree (null)
        TreeNode root1 = null;
        System.out.println("Is Empty Tree a Valid BST? " + solution.isValidBST(root1));  // Expected: true

        // Test Case 2: Single node tree
        TreeNode root2 = tree.new TreeNode(1);
        System.out.println("Is Single Node Tree a Valid BST? " + solution.isValidBST(root2));  // Expected: true

        // Test Case 3: Valid BST with multiple nodes
        //        2
        //       / \
        //      1   3
        TreeNode root3 = tree.new TreeNode(2);
        root3.left = tree.new TreeNode(1);
        root3.right = tree.new TreeNode(3);
        System.out.println("Is Valid BST (multiple nodes) a Valid BST? " + solution.isValidBST(root3));  // Expected: true

        // Test Case 4: Invalid BST
        //        5
        //       / \
        //      1   4
        //         / \
        //        3   6
        TreeNode root4 = tree.new TreeNode(5);
        root4.left = tree.new TreeNode(1);
        root4.right = tree.new TreeNode(4);
        root4.right.left = tree.new TreeNode(3);
        root4.right.right = tree.new TreeNode(6);
        System.out.println("Is Invalid BST a Valid BST? " + solution.isValidBST(root4));  // Expected: false

        // Test Case 5: Right-skewed tree (Valid BST)
        //   1
        //    \
        //     2
        //      \
        //       3
        TreeNode root5 = tree.new TreeNode(1);
        root5.right = tree.new TreeNode(2);
        root5.right.right = tree.new TreeNode(3);
        System.out.println("Is Right-Skewed Tree a Valid BST? " + solution.isValidBST(root5));  // Expected: true

        // Test Case 6: Left-skewed tree (Valid BST)
        //     3
        //    /
        //   2
        //  /
        // 1
        TreeNode root6 = tree.new TreeNode(3);
        root6.left = tree.new TreeNode(2);
        root6.left.left = tree.new TreeNode(1);
        System.out.println("Is Left-Skewed Tree a Valid BST? " + solution.isValidBST(root6));  // Expected: true

        // Test Case 7: Tree with duplicate values (Invalid BST)
        //      2
        //     / \
        //    1   2
        TreeNode root7 = tree.new TreeNode(2);
        root7.left = tree.new TreeNode(1);
        root7.right = tree.new TreeNode(2);
        System.out.println("Is Tree with Duplicate Values a Valid BST? " + solution.isValidBST(root7));  // Expected: false
    }
}
