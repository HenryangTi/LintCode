package maximumDepthOfBinaryTree_nineChapter_alg3;

public class maximumDepthOfBinaryTree_nineChapter_alg3 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        /**
         * 整棵二叉树的高度依赖于左右子树的高度
         */
        return Math.max(left, right) + 1;
    }
}
