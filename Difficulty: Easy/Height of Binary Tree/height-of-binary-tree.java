/*
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    static int height(Node root) {
        if (root == null) {
            return -1;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        int max =  Math.max(lh, rh ) + 1;
        return max;
    }
}
