class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        
        temp = head;
        while(temp != null){
            if(temp.data != st.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
    
}