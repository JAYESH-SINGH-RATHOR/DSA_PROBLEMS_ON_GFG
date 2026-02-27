/*
Structure of Node class is:

class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/

class Solution {
    int ans = -1;
    public int kthAncestor(Node root, int k, int node) {
        // Write your code here
        find(root , k , node);
        return ans;
            }
            int find(Node root , int k , int node){
                if(root == null){
                    return -1;
                }
                if(root.data == node){
                    return 0;
                }
                int lh = find(root.left , k , node);
                int rh = find(root.right , k , node);
                if(lh == -1 && rh == -1){
                    return -1;
                }
                int max = Math.max(lh , rh ) + 1;
                if(max == k){
                    ans = root.data;
                }
                return max;
            }
}