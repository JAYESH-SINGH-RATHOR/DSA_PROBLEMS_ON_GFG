class Solution {
    static void rotateArr(int[] arr, int d) {
        int n = arr.length;
         if (n == 0) return; 
            d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }
    
 static void reverse(int arr[], int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}