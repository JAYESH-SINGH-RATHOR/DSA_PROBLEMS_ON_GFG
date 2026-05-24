class Solution {
    public Node removeAllDuplicates(Node head) {
        // code here
        Node dummy = new Node(0);
        Node prev = dummy;
        dummy.next = head;
        Node curr = head;
        
        while(curr != null){
            if(curr.next != null && curr.data == curr.next.data){
                while(curr.next != null && curr.data == curr.next.data){
                    curr = curr.next;
                }
                prev.next = curr.next;
            }
            else{
                prev = prev.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}