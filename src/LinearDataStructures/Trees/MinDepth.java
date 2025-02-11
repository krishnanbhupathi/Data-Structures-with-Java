package Trees;

public class MinDepth {

    public static int minDepth(TreeNode root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        int lDepth = minDepth(root.left);
        int rDepth = minDepth(root.right);
        if(root.left == null)
            return rDepth + 1;
        if(root.right == null)
            return lDepth + 1;
        return Math.min(lDepth, rDepth) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(minDepth(root));

        root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);
        root.right.right.right.right = new TreeNode(6);

        System.out.println(minDepth(root));
    }
}
