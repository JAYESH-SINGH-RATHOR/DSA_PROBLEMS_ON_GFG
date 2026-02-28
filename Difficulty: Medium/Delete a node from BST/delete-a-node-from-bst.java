/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public Node delNode(Node root, int x) {
        // code here
        if(root == null){
            return null;
        }
            if(x < root.data){
                root.left = delNode(root.left , x);
            }
            else if(x > root.data){
                root.right = delNode(root.right , x);
            }
             else{
                if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
        Node is = findInOrderSuccessor(root.right);
        root.data = is.data;
        root.right = delNode(root.right , is.data);
        }
        return root;
    }
    Node findInOrderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
}