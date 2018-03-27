package MaximumBinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*

如果比之前的小，就应该是之前的node的child，又因为从左到右抽，小的就应该在右面
vice versa.
 leetcode 654. Maximum Binary Tree
Brilliant solution!!!!!!!!!!!!

class Solution {
public:
    TreeNode* constructMaximumBinaryTree(vector<int>& nums) {
        vector<TreeNode*> stk;
        for (int i = 0; i < nums.size(); ++i)
        {
            TreeNode* cur = new TreeNode(nums[i]);
            while (!stk.empty() && stk.back()->val < nums[i])
            {
                cur->left = stk.back();
                stk.pop_back();
            }
            if (!stk.empty())
                stk.back()->right = cur;
            stk.push_back(cur);
        }
        return stk.front();
    }
};
 */

public class BuildTree {
    public static void main(String[] args){
        TreeNode root;
        int[] arr = {3, 2, 1, 6, 0, 5};
        ArrayList arrL = new ArrayList();
        for(int i = 0; i < arr.length; i++){
            arrL.add(arr[i]);
        }
        BuildTree BT = new BuildTree();
        root = BT.FindMax(arrL);

    }
    private TreeNode FindMax(List arrL){
        List ArrLeft = new ArrayList();
        List ArrRight = new ArrayList();
        int maxNum = (int)arrL.get(0);
        int index = 0;

        for(int i = 0; i < arrL.size(); i++) {
            if ((int)arrL.get(i) > maxNum) {
                maxNum = (int)arrL.get(i);
                index = i;
            }
        }
        if((index != 0) && (index != arrL.size() - 1)){

            ArrLeft =  arrL.subList(0, index);
            ArrRight = arrL.subList(index + 1, arrL.size());
        }
        else if(index == 0){
            ArrRight = arrL.subList(index + 1, arrL.size());
        }
        else{
            ArrLeft = arrL.subList(0, index);
        }
        TreeNode node = new TreeNode(maxNum);
        if(ArrLeft.size() != 0){
            TreeNode lnode = FindMax(ArrLeft);
            node.left = lnode;
        }
        if(ArrRight.size() != 0){
            TreeNode rightNode = FindMax(ArrRight);
            node.right = rightNode;
        }
        return node;
    }
}

