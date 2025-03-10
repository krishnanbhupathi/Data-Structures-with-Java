package Trees;

public class PathSum {

    private static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
            return false;
        if(root.left == null && root.right == null)
            return root.data == targetSum;

        boolean leftSum = hasPathSum(root.left, targetSum - root.data);
        boolean rightSum = hasPathSum(root.right, targetSum - root.data);
        return leftSum || rightSum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;
        System.out.println(hasPathSum(root, targetSum));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        targetSum = 5;

        System.out.println(hasPathSum(root, targetSum));
    }
}
