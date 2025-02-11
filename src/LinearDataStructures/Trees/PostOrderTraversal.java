package Trees;

import java.util.ArrayList;

public class PostOrderTraversal {

    private static ArrayList<Integer> list = new ArrayList<>();

    private static void postOrderTraversal(TreeNode root){
        if(root == null)
            return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        list.add(root.data);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        postOrderTraversal(root);
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

        postOrderTraversal(root);
        System.out.println(list);
    }
}
