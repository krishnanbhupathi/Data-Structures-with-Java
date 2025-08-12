package Trees.Medium;

import Trees.TreeNode;

import java.util.ArrayList;

public class ValidateBST {
    private static ArrayList<Integer> list = new ArrayList<>();

    private static void inOrder(TreeNode root){
        if(root == null)
            return;
        inOrder(root.left);
        list.add(root.data);
        inOrder(root.right);
    }

    private static boolean isValidBST(TreeNode root){
        inOrder(root);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) <= list.get(i-1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        System.out.println(isValidBST(root));

        root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

        System.out.println(isValidBST(root));
    }
}
