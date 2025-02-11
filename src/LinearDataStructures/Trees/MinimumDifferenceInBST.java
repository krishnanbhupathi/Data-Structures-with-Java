package Trees;

import java.util.ArrayList;

public class MinimumDifferenceInBST {

    private static void inOrderTraversal(TreeNode root, ArrayList<Integer> list){
        if(root == null)
            return;
        inOrderTraversal(root.left, list);
        list.add(root.data);
        inOrderTraversal(root.right, list);
    }
    private static int getMinimumDifference(TreeNode root){
        ArrayList<Integer> inOrderList = new ArrayList<>();
        inOrderTraversal(root, inOrderList);

        int result = Integer.MAX_VALUE;
        for(int i = 1; i < inOrderList.size(); i++){
            result = Math.min(result, inOrderList.get(i) - inOrderList.get(i-1));
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        System.out.println(getMinimumDifference(root));

        root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(48);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(49);

        System.out.println(getMinimumDifference(root));
    }
}
