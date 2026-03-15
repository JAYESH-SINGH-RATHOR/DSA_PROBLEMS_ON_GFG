class Solution {
    int maxIndexDiff(int[] arr) {
        // code here
        
        // brute forced
        
        // int n = arr.length;
        // int maxdiff = 0;
        // for(int i = 0; i < n; i++){
        //     for(int j = i; j < n; j++){
        //         if(arr[i] <= arr[j] ){
        //             maxdiff = Math.max(maxdiff ,  j - i);
        //         }
        //     }
        // }
        // return maxdiff;
        
        // optimized appraoch 
        
         Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(st.isEmpty() || arr[i] < arr[st.peek()]){
                st.push(i);
            }
        }
        int maxdiff = 0;
        for(int j = n - 1; j >= 0; j--){

            while(!st.isEmpty() && arr[j] >= arr[st.peek()]){
                maxdiff = Math.max(maxdiff , j - st.peek());
                st.pop();
            }
        }

        return maxdiff;
    }
}

