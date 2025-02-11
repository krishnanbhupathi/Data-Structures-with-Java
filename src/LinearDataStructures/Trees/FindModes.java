package Trees;

import java.util.ArrayList;

public class FindModes {

    private ArrayList<Integer> modes = new ArrayList<>();
    private int currentValue = -1;
    private int currentCount = 0;
    private int maxCount = 0;

    private  void inOrderTraversal(TreeNode root) {
        if(root == null)
            return;
        inOrderTraversal(root.left);

        currentCount = (root.data == currentValue) ? currentCount + 1: 1;
        if(currentCount == maxCount){
            modes.add(root.data);
        }else if(currentCount > maxCount) {
            modes.clear();
            modes.add(root.data);
            maxCount = currentCount;
        }
        currentValue = root.data;
        inOrderTraversal(root.right);
    }
    private ArrayList<Integer> findMode(TreeNode root){
        inOrderTraversal(root);
        return modes;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);

        FindModes obj = new FindModes();
        System.out.println(obj.findMode(root));
    }
}
