package Trees;

import java.util.ArrayList;

public class PreOrderTraversal {

    private static ArrayList<Integer> list = new ArrayList<>();

    private static void preOrderTraversal(TreeNode root){
        if(root == null)
            return;
        list.add(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        preOrderTraversal(root);
        System.out.println(list);
        list.clear();

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);

        preOrderTraversal(root);
        System.out.println(list);

    }
}
