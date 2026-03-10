class Solution {
    int missingNum(int arr[]) {
        long n = arr.length + 1;   
        long expectednum = (long)n * (n + 1) / 2;

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return (int) expectednum - sum;
    }
}