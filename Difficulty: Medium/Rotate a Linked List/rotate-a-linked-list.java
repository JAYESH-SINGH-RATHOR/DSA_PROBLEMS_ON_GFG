/* Linked List Node Structure
class Node {
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
   }
} */

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        if(head == null || head.next == null || k == 0){
            return head;
        }
        int size = 1;
        Node curr = head;
        while(curr.next != null){
            size++;
            curr = curr.next;
        }
        k = k % size;
        if(k == 0){
            return head;
        }
        curr.next = head;
        Node temp = head;
        int target = size - k - 1;
        for(int i= 1; i < k; i++){
            temp = temp.next;
        }
        Node newNode = temp.next;
        temp.next = null;
        return newNode;
    }
}