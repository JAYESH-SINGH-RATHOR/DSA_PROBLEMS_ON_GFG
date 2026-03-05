/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    
    int maxSum = Integer.MIN_VALUE;

    int solve(Node root){
        if(root == null){
            return 0;
        }

        int left = Math.max(0, solve(root.left));
        int right = Math.max(0, solve(root.right));

        int current = left + right + root.data;

        maxSum = Math.max(maxSum, current);

        return root.data + Math.max(left, right);
    }

    int findMaxSum(Node root) {
        solve(root);
        return maxSum;
    }
}