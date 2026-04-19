// User function Template for Java

class Solution {

    // function to count all pairs
    // from both the sorted arrays
    // whose sum is equal to a given
    // value
    static int countPairs(int arr1[], int arr2[], int x) {
        // code here.
        int n = arr1.length;
        int m = arr2.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr1[i] + arr2[j] == x){
                    count++;
                }
            }
        }
        return count;
    }
}