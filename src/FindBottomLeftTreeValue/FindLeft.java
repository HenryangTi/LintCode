package FindBottomLeftTreeValue;

import java.util.LinkedList;
import java.util.Queue;

public class FindLeft {
    public static void main(String[] args){
        Queue qu = new LinkedList();
        int num;
        TreeNode Node;
        TreeNode nodeTest = null;
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node2.left = node1;
        node2.right = node3;

        qu.offer(node1);
        while(!qu.isEmpty()){
            num = qu.size();

            LinkedList l = new LinkedList();
            for(int i = 0; i < num; i++){
                Node = (TreeNode) qu.poll();
                l.add(Node);
                if(Node.left != null) {
                    qu.offer(Node.left);
                }
                if(Node.right != null) {
                    qu.offer(Node.right);
                }
            }
            nodeTest = (TreeNode) l.get(0);
        }

            System.out.println(nodeTest.val);

    }
}
