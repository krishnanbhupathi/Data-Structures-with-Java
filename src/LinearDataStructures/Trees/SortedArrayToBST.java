package Trees;

public class SortedArrayToBST {

    public static TreeNode helper(int[] arr, int start, int end){
        if(start > end)
            return null;
        int mid = (start + end)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = helper(arr, start, mid -1);
        root.right = helper(arr, mid + 1, end);
        return root;
    }
    public static TreeNode sortedArrayToBST(int[] arr){
        int n = arr.length;
        return helper(arr, 0, n-1);
    }

    public static void printInorder(TreeNode root){
        if(root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }
    public static void main(String[] args) {
        int[] arr = {-10,-3,0,5,9};
        TreeNode root = sortedArrayToBST(arr);

        printInorder(root);
    }
}
