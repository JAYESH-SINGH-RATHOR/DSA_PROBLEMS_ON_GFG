class Solution {
    static int inversionCount(int arr[]) {
        // Code Here
        
        // bruteforce appraoch 
        
        // int n = arr.length;
        //  int count = 0;
        // for(int i = 0; i < n; i++){
           
        //     for(int j = i + 1; j < n; j++){
        //         if(i < j && arr[i] > arr[j]){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        
        return mergesort(arr , 0 , arr.length  -1);
    }
   static int mergesort(int arr[] , int low , int high){
        int n = arr.length;
        int count = 0;
        if(low < high){
            int mid = low + (high - low) / 2;
            count += mergesort(arr , low , mid);
            count += mergesort(arr , mid + 1 , high);
            count += merge(arr , low, mid , high);
        }
        return count;
    }
    
    static int merge(int arr[] , int low , int mid , int high){
        int temp[] = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;
        int count = 0;
         while(left <= mid && right <= high){
             if(arr[left] <= arr[right]){
                 temp[k++] = arr[left++];
             }else{
                 count += (mid - left + 1);
                 temp[k++] = arr[right++];
             }
         }
         while(left <= mid){
             temp[k++] = arr[left++];
         }
         while(right <= high){
             temp[k++] = arr[right++];
         }
         for(int i = 0; i < temp.length; i++){
             arr[low + i] = temp[i];
         }
         return count;
    }
}