/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public void reorderList(Node head) {
        // code here
        if(head == null){
            return;
        }
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node secoundHalf = reverse(slow.next);
            slow.next = null;
            Node firsthalf = head;
            while(secoundHalf != null){
                Node temp1 = firsthalf.next;
                Node temp2 = secoundHalf.next;
                
                firsthalf.next = secoundHalf;
                secoundHalf.next = temp1;
                
                firsthalf = temp1;
                secoundHalf = temp2;
            }
    }
    public Node reverse(Node head){
                Node curr = head;
                Node prev = null;
                Node next;
                while(curr != null){
                    next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }
                return prev;
            }
}