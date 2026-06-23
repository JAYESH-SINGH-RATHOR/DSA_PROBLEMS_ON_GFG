import java.util.*;

class Solution {
    public void rearrangeQueue(Queue<Integer> q) {

        int n = q.size();
        int half = n / 2;

        Queue<Integer> firstHalf = new LinkedList<>();

        // Store first half
        for(int i = 0; i < half; i++) {
            firstHalf.add(q.remove());
        }

        // Interleave
        while(!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }
}