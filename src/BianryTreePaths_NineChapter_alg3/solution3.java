package BianryTreePaths_NineChapter_alg3;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.先处理null
 * 2.处理正常的拆解
 * 3.验证leaf node是否正确
 */
public class solution3 {
    public List binaryTreePaths(TreeNode root){
        List paths = new ArrayList();
        if(root == null){
            return paths;
        }
        /**
         * 处理leaf node情况
         */
        if(root.left == null && root.right == null){
            paths.add("" + root.val);
            return paths;
        }

        List<String> leftPaths = binaryTreePaths(root.left);
        List<String> rightPaths = binaryTreePaths(root.right);

        for (String path : leftPaths){
            paths.add(root.val + "->" + path);
        }
        for(String path : rightPaths){
            paths.add(root.val + "->" + path);
        }
        return paths;

    }
}
