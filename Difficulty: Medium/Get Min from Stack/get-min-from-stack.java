// class SpecialStack {
//         Stack<Integer> st;
//     public SpecialStack() {
//         // Define Stack
//         st = new Stack<>();
//     }

//     public void push(int x) {
//         // Add an element to the top of Stack
//         st.push(x);
//     }

//     public void pop() {
//         // Remove the top element from the Stack
//         if(!st.isEmpty()){
//             st.pop();
//         }
//     }

//     public int peek() {
//         // Returns top element of the Stack
//         if(!st.isEmpty()){
//             return st.peek();
//         }
//         return -1;
//     }

//     boolean isEmpty() {
//         // Check if the stack is empty
//         return st.isEmpty();
//     }

//     public int getMin() {
//         // Finds minimum element of Stack
//         if(st.isEmpty()){
//           return -1; 
//         }
//         return st.peek();
//     }
// }

import java.util.Stack;

class SpecialStack {
    // 1. Declare stacks as member variables so all methods can access them
    private Stack<Integer> st;
    private Stack<Integer> minSt;

    public SpecialStack() {
        // 2. Initialize the stacks inside the constructor
        st = new Stack<>();
        minSt = new Stack<>();
    }

    public void push(int x) {
        // Add to main stack
        st.push(x);
        
        // Add to min stack if it is empty or if x is smaller than/equal to current min
        if (minSt.isEmpty() || x <= minSt.peek()) {
            minSt.push(x);
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            int poppedValue = st.pop();
            
            // If the popped element was the minimum, remove it from minSt too
            if (poppedValue == minSt.peek()) {
                minSt.pop();
            }
        }
    }

    public int peek() {
        if (!st.isEmpty()) {
            return st.peek();
        }
        return -1;
    }

    public boolean isEmpty() {
        return st.isEmpty();
    }

    public int getMin() {
        // 3. Return the top of the minSt helper stack in O(1) time
        if (minSt.isEmpty()) {
           return -1; 
        }
        return minSt.peek();
    }
}
