/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
       traversal(root , res);
       return res;
    }
    public static void traversal(Node root , ArrayList<Integer> res){
        if(root == null){
            return;
        }
        traversal(root.left , res);
        traversal(root.right , res);
        res.add(root.data);  
    }
}