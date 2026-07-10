/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        if(head == null){
            return null;
        }
       ArrayList<Integer> list =new ArrayList<>();
       Node temp = head;
       while(temp != null){
           list.add(temp.data);
           temp = temp.next;
       }
    //   System.out.print(list);
       Collections.sort(list);
       temp = head;
       for(int i = 0; i < list.size(); i++){
           temp.data = list.get(i);
           temp = temp.next;
       }
       return head;
    }
}