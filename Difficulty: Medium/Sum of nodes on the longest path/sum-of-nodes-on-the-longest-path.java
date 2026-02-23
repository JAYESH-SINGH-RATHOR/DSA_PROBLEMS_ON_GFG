/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
} */
class Solution {
    int maxlen = 0;
    int maxsum = 0;
    public int sumOfLongRootToLeafPath(Node root) {
        // code here
         height(root , 0 , 0);
         return maxsum;
    }
    public void height(Node root , int len , int sum){
        if(root == null){
            return;
        }
        sum += root.data;
        len++;
        if(root.left == null && root.right == null){
            if(len > maxlen){
                maxlen = len;
                maxsum = sum;
            }
            else if(len == maxlen){
               maxsum =  Math.max(maxsum , sum);
            }
        }
        height(root.left , len , sum);
            height(root.right , len , sum);
    }
}