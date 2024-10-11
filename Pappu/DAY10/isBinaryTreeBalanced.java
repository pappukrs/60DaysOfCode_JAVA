package Pappu.DAY10;

public class isBinaryTreeBalanced {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
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
    
    
}
