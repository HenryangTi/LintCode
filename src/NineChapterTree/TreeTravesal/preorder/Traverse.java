package NineChapterTree.TreeTravesal.preorder;

import NineChapterTree.TreeTravesal.preorder.TreeTravesal;

import java.util.ArrayList;

/**
 * 这种解法可以想象为一个小人带着本子亲力亲为的走每一个节点
 */

/**
 * 1.递归的定义:把以root为根的二叉树的preorder丢进result里
 * 2.递归的拆解：在此树的结构天然的做了拆解
 * 3.递归的出口
 */

public class Traverse {
    public ArrayList<Integer> preorderTraversal(TreeTravesal.TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        traverse(root, result);
        return result;
    }
    // 把root为跟的preorder加入result里面
    /*
    * result数组接住该节点下面的所有的前序遍历
    * */
    private void traverse(TreeTravesal.TreeNode root, ArrayList<Integer> result) {
        //递归的出口
        if (root == null) {
            return;
        }
        result.add(root.val);
        traverse(root.left, result);
        traverse(root.right, result);
    }
}
