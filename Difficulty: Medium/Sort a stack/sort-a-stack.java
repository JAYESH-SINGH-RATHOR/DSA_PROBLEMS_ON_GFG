class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        int n = st.size();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = st.pop();
        }
        Arrays.sort(arr);
        
        for(int i = 0; i < n; i++){
            st.push(arr[i]);
        }
    }
}