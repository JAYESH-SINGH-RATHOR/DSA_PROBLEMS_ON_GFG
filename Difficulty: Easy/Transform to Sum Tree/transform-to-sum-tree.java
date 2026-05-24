/* Structure for Tree Node
class Node {
    int data;
    Node left, right;

    // Constructor
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/
class Solution {
    public int toSumTree(Node root) {
        // code here
        if(root == null){
            return 0;
        }
        int lh = toSumTree(root.left);
        int rh = toSumTree(root.right);
        
        int oldval = root.data;
        root.data = rh + lh;
        return oldval + lh + rh;
    }
}