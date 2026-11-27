class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int c1 = 1 + maxDepth(root.left);
        int c2 = 1 + maxDepth(root.right);
        return Math.max(c1,c2);
    }
}
