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
        rec(root);
        return diameterr;
    }
    int rec(Node root){
        if(root == null){
            return 0;
        }
        int lh = rec(root.left);
        int rh = rec(root.right);
        diameterr = Math.max(diameterr , lh + rh);
        return 1 + Math.max(lh , rh);
    }
}