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
    int diameter = 0;
    public int diameter(Node root) {
        // code here
        height(root);
        return diameter;   
    }
     int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        diameter = Math.max(diameter , lh + rh);
        return Math.max(lh , rh) + 1;
    }
}


   