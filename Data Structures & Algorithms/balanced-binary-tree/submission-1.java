class Solution {
    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;
    }

    private int dfsHeight(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = dfsHeight(root.left);
        if (leftHeight == -1) return -1; // Left side is already broken

        int rightHeight = dfsHeight(root.right);
        if (rightHeight == -1) return -1; // Right side is already broken

        // If current node is unbalanced, return -1
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        // Otherwise, return the actual height to the parent
        return Math.max(leftHeight, rightHeight) + 1;
    }
}