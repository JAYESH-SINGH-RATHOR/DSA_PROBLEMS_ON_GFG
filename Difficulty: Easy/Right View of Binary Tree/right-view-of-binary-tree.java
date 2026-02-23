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
    public ArrayList<Integer> rightView(Node root) {
        // code here
        height(root , 0);
        return res;
    }
    void height(Node root ,  int lebel){
        if(root == null){
            return;
        }
        if(lebel == res.size()){
            res.add(root.data);
        }
        height(root.right , lebel + 1);
        height(root.left , lebel + 1);
    }
}