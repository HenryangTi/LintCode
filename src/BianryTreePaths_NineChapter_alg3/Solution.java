package BianryTreePaths_NineChapter_alg3;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();

        if (root == null) {
            return paths;
        }

        List<String> leftPaths = binaryTreePaths(root.left);
        List<String> rightPaths = binaryTreePaths(root.right);
        for (String path : leftPaths) {
            paths.add(root.val + "->" + path);
        }
        for (String path : rightPaths) {
            paths.add(root.val + "->" + path);
        }

        // root is a leaf
        if (paths.size() == 0) {
            paths.add("" + root.val);
        }

        return paths;
    }
}
