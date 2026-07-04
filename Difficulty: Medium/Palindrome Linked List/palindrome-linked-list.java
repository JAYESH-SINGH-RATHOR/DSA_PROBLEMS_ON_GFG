/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
          if (head == null || head.next == null){
               return true;
          }
        Stack<Integer> st = new Stack<>();
        Node temp = head;
       while(temp != null){
           st.push(temp.data);
           temp = temp.next;
       }
    //   System.out.print(st);
            temp = head;
       while( temp != null){
           if(temp.data != st.pop()){
               return false;
           }
               temp = temp.next;
       }
       return true;
    }
}