/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
     ArrayList<Integer> res = new ArrayList<>();
    public ArrayList<Integer> leftView(Node root) {
        // code here
            height(root , 0);
            return res;
    }
    public  void height(Node root , int level){
        if(root == null){
            return;
        }   
        if(level == res.size()){
            res.add(root.data);
        }
        height(root.left , level + 1);
        height(root.right , level + 1);
    }
}