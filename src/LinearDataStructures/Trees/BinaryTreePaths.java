package Trees;

import java.util.ArrayList;

public class BinaryTreePaths {

    private static ArrayList<String> result = new ArrayList<>();

    private static void binaryTreePaths(TreeNode root, String s){
        if(root == null)
            return;
        if(root.left == null && root.right == null) {
            result.add(s + root.data);
        }
        else{
            binaryTreePaths(root.left, s+root.data+"->");
            binaryTreePaths(root.right, s+root.data+"->");
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        binaryTreePaths(root, "");
        System.out.println(result);
        result.clear();

        root = new TreeNode(1);
        binaryTreePaths(root, "");
        System.out.println(result);
    }
}
