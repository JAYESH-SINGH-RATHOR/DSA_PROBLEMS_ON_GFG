/*Complete the Given Function

Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    public void toSumTree(Node root) {
        // add code here.
       height(root);
    }
    int height(Node root){
        if(root == null){
            return 0;
        }
        int oldval = root.data;
        int lh = height(root.left);
        int rh = height(root.right);
        root.data = lh + rh;
        return root.data + oldval;
    }
}