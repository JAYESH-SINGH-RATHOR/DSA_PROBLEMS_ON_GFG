/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        if(k > size){
            return -1;
        }
        int target = size - k;
        temp = head;
        for(int i = 0; i < target; i++){
            temp = temp.next;
        }
        // System.out.print(target);
        return temp.data;
    }
}