/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBST(Node root) {
        // code here
            return validate(root , null , null);
    }
    boolean validate(Node root , Node max , Node min){
        if(root == null){
            return true;
        }
        else if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }
        return validate(root.left , root , min ) && validate(root.right , max , root);
    }
}