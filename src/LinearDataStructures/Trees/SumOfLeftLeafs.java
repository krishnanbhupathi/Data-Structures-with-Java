package Trees;

import java.util.Stack;

class Pair{
    private TreeNode key;
    private boolean value;

    Pair(TreeNode key, boolean value){
        this.key = key;
        this.value = value;
    }

    public TreeNode getKey(){
        return this.key;
    }

    public boolean getValue(){
        return this.value;
    }
}
public class SumOfLeftLeafs {

    // recursive approach
    private static int sumOfLeftLeafs(TreeNode root){
        if(root == null)
            return 0;
        if(root.left != null && root.left.left == null && root.left.right == null){
            return root.left.data + sumOfLeftLeafs(root.right);
        }
        return sumOfLeftLeafs(root.left) + sumOfLeftLeafs(root.right);
    }

    // iterative approach
    private static int sumOfLeftLeafsRec(TreeNode root){
        if(root == null)
            return 0;
        Stack<Pair> s = new Stack<>();
        s.push(new Pair(root, false));
        int result = 0;
        while(!s.isEmpty()){
            Pair p = s.pop();
            TreeNode node = p.getKey();
            boolean isLeft = p.getValue();

            if(isLeft && node.left == null && node.right == null){
                result += node.data;
            }
            if(node.left != null){
                s.push(new Pair(node.left, true));
            }
            if(node.right != null){
                s.push(new Pair(node.right, false));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(sumOfLeftLeafs(root));
        System.out.println(sumOfLeftLeafsRec(root));

        root = new TreeNode(1);
        System.out.println(sumOfLeftLeafs(root));
        System.out.println(sumOfLeftLeafsRec(root));
    }
}
