/* Structure of a linked list node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}
*/
class Solution {

    public Node deleteAllOccurances(Node head, int x) {
        // code here
        if(head == null){
            return head;
        }
        while(head != null && head.data == x){
            head = head.next;
        }
            Node temp = head;
        while(temp != null && temp.next != null){
            if(temp.next.data == x){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
}