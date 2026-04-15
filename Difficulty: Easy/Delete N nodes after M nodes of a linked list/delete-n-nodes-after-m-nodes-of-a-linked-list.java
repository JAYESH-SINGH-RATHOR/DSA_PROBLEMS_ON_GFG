/*
delete n nodes after m nodes
The input list will have at least one element
Node is defined as
  class Node
  {
      int data;
      Node next;
      Node(int data)
      {
          this.data = data;
          this.next = null;
      }
  }
*/

class Solution {
    static void linkdelete(Node head, int n, int m) {
        // your code here
            Node curr = head;
            while(curr != null){
                for(int i = 1; i < m && curr != null; i++){
                    curr = curr.next;
                }
                if(curr == null){
                    return;
                }
                Node temp = curr.next;
                for(int j = 1; j <= n && temp != null; j++){
                    temp = temp.next;
                }
                curr.next = temp;
                curr  = temp;
            }
    }  
}


  