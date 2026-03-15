/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/


class Solution {
    int getCount(Node root, int l, int h) {
        
        if(root == null) return 0;
        
        int count = 0;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            
            Node curr = stack.pop();
            
            if(curr == null) continue;
            
            if(curr.data >= l && curr.data <= h){
                count++;
                stack.push(curr.left);
                stack.push(curr.right);
            }
            else if(curr.data < l){
                stack.push(curr.right);
            }
            else{
                stack.push(curr.left);
            }
        }
        
        return count;
    }
}