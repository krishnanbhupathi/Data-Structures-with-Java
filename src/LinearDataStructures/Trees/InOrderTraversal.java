package Trees;

import java.util.ArrayList;
import java.util.Stack;

class TreeNode{
    int data;
    TreeNode left, right;

    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
}

public class InOrderTraversal {

    private static final ArrayList<Integer> list = new ArrayList<>();

    private static final ArrayList<Integer> iterativeList = new ArrayList<>();

    // recursive solution
    public static void getInorder(TreeNode root) {
        if(root == null)
            return;
        getInorder(root.left);
        list.add(root.data);
        getInorder(root.right);
    }

    // iterative solution
    public static void iterativeInorder(TreeNode root) {
       if(root == null)
           return;
       Stack<TreeNode> s = new Stack<>();
       TreeNode curr = root;
       while(curr != null || !s.isEmpty()){
           while(curr != null){
               s.push(curr);
               curr = curr.left;
           }
           curr = s.pop();
           iterativeList.add(curr.data);
           curr = curr.right;
       }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        getInorder(root);
        System.out.println(list);

        iterativeInorder(root);
        System.out.println(iterativeList);
    }
}
