package NineChapterTree.TreeTravesal.preorder;

import NineChapterTree.TreeTravesal.preorder.TreeTravesal;

import java.util.ArrayList;

/**
 * 碰到二叉树，就想想整棵树在该问题上的结果
 * 和左右儿子在该问题上的结果之间的联系是什么
 */

public class divideConquer {
    public ArrayList<Integer> preorderTraversal(TreeTravesal.TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        // null or leaf
        //递归的出口
        if (root == null) {
            return result;
        }

        // Divide
        /*
            递归的拆解
         */
        ArrayList<Integer> left = preorderTraversal(root.left);
        ArrayList<Integer> right = preorderTraversal(root.right);

        // Conquer
        //归并
        result.add(root.val);
        result.addAll(left);
        result.addAll(right);
        return result;
    }
}
