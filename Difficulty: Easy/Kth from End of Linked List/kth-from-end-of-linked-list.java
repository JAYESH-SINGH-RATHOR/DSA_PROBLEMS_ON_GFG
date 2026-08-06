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
		Node temp = head;
		int size = 0;
		while (temp != null) {
			temp = temp.next;
			size++;
		}
		if(k > size || k == 0){
		    return -1;
		}
		int target = size - k;
		temp = head;
		for(int i = 0; i < target; i++){
		    temp = temp.next;
		}
		return temp.data;
	}
}
