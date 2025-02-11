package Trees;

public class DiameterOfBT {
    private static  int diameter = 0;
    private static  int helper(TreeNode root){
        if(root == null)
            return 0;
        int lDiameter = helper(root.left);
        int rDiameter = helper(root.right);
        diameter = Math.max(diameter, lDiameter+rDiameter);
        return Math.max(lDiameter, rDiameter) + 1;
    }

    private static int getDiameter(TreeNode root){
        helper(root);
        return diameter;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(getDiameter(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        diameter = 0; // coz of static variable

        System.out.println(getDiameter(root));

    }
}
