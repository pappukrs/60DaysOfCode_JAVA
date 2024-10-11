package Pappu.DAY10;
import java.util.*;

public class BinaryTreeInorderTraversal {

    // Definition of TreeNode class
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // Solution class with inorderTraversal method
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            inorderHelper(root, result);
            return result;
        }

        private void inorderHelper(TreeNode root, List<Integer> result) {
            if (root == null) {
                return;
            }
            inorderHelper(root.left, result);
            result.add(root.val);
            inorderHelper(root.right, result);
        }
    }

    // Method to run test cases
    public static void main(String[] args) {
        BinaryTreeInorderTraversal treeTraversal = new BinaryTreeInorderTraversal();
        Solution solution = treeTraversal.new Solution();

        // Test case 1: Empty tree
        TreeNode root1 = null;
        System.out.println("Inorder Traversal of Empty Tree: " + solution.inorderTraversal(root1));

        // Test case 2: Single node tree
        TreeNode root2 = treeTraversal.new TreeNode(1);
        System.out.println("Inorder Traversal of Single Node Tree: " + solution.inorderTraversal(root2));

        // Test case 3: Tree with multiple nodes
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        TreeNode root3 = treeTraversal.new TreeNode(1);
        root3.left = treeTraversal.new TreeNode(2);
        root3.right = treeTraversal.new TreeNode(3);
        root3.left.left = treeTraversal.new TreeNode(4);
        root3.left.right = treeTraversal.new TreeNode(5);
        System.out.println("Inorder Traversal of Tree 1->2->3->4->5: " + solution.inorderTraversal(root3));

        // Test case 4: Skewed tree (left-heavy)
        //       1
        //      /
        //     2
        //    /
        //   3
        TreeNode root4 = treeTraversal.new TreeNode(1);
        root4.left = treeTraversal.new TreeNode(2);
        root4.left.left = treeTraversal.new TreeNode(3);
        System.out.println("Inorder Traversal of Left-Heavy Tree: " + solution.inorderTraversal(root4));

        // Test case 5: Skewed tree (right-heavy)
        //   1
        //    \
        //     2
        //      \
        //       3
        TreeNode root5 = treeTraversal.new TreeNode(1);
        root5.right = treeTraversal.new TreeNode(2);
        root5.right.right = treeTraversal.new TreeNode(3);
        System.out.println("Inorder Traversal of Right-Heavy Tree: " + solution.inorderTraversal(root5));
    }
}
