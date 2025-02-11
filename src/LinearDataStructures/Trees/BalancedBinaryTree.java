package Trees;

public class BalancedBinaryTree {
    private static boolean balanced = true;

    public static boolean isBalanced(TreeNode root){
        height(root);
        return balanced;
    }

    public static int height(TreeNode root){
        if(root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if(Math.abs(leftHeight - rightHeight) > 1)
            balanced = false;
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static void main(String[] args) {
        System.out.println(isBalanced(null));

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(isBalanced(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
        root.right = new TreeNode(2);

        System.out.println(isBalanced(root));
    }
}
