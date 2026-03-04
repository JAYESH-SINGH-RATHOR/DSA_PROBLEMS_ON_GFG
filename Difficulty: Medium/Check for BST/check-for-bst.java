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
       return isvalidbst(root ,  null ,null);
    }
    boolean isvalidbst(Node root , Node max , Node min){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }
        return isvalidbst(root.left , root , min) && isvalidbst(root.right , max , root);
    }
}