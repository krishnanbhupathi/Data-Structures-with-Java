package Trees;

public class RangeSumBST {

    private static int rangeSumInBST(TreeNode root, int low, int high){
        if(root == null)
            return 0;
        if(root.data < low)
            return rangeSumInBST(root.right, low, high);
        if(root.data > high)
            return rangeSumInBST(root.left, low, high);
        return root.data + rangeSumInBST(root.left, low, high) +
                           rangeSumInBST(root.right, low, high);
    }
    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        int low = 7;
        int high = 15;
        System.out.println(rangeSumInBST(root, low, high));

        root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);
        root.left.left.left = new TreeNode(1);
        root.left.right.left = new TreeNode(6);

        low = 6; high = 10;
        System.out.println(rangeSumInBST(root, low, high));

    }
}
