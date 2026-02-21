/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution {
    int diameterr = 0;
    public int diameter(Node root) {
        // code here
        if(root == null){
            return 0;
        }
        height(root);
        return diameterr;
    }
    public  int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        diameterr = Math.max(diameterr , lh + rh );
        return Math.max(lh , rh) + 1;
        
    }
}