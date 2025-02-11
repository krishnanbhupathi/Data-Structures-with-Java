package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class InvertTree {

    private static TreeNode invertTree(TreeNode root){
        if(root == null)
            return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    private static void printLevelOrder(TreeNode root){
        if(root == null)
            return;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                System.out.print(node.data+" ");
                if(node.left != null)
                    q.offer(node.left);
                if(node.right != null)
                    q.offer(node.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        printLevelOrder(root);
        root = invertTree(root);
        printLevelOrder(root);

        root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        printLevelOrder(root);
        root = invertTree(root);
        printLevelOrder(root);

    }
}
