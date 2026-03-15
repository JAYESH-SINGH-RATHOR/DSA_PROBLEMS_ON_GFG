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
        // Your code here
        Stack<Node> st = new Stack<>();
        int count = 0;
        st.push(root);
        
        while(!st.isEmpty()){
            
            Node curr = st.pop();
            if(curr == null){
                continue;
            }
            if(curr.data >= l && curr.data <= h){
                count++;
                st.push(curr.left);
                st.push(curr.right);
            }
            else if(curr.data < l){
                st.push(curr.right);
            }
            else{
                st.push(curr.left);
            }
        }
        return count;
    }
}