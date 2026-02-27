/*
class Node {
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    Node lca(Node root, int n1, int n2) {
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node lh =  lca(root.left , n1 , n2);
        Node rh = lca(root.right , n1 , n2);
        if(lh == null){
            return rh;
        }
        if(rh == null){
            return lh;
        }
        return root;
    }
}