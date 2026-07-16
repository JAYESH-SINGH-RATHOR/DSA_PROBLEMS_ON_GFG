class Solution {
    public void rotateArr(int arr[], int d) {

        int n = arr.length;
        d = d % n;

        int[] temp = new int[n];

        for(int i = 0; i < n; i++){
            temp[i] = arr[(i + d) % n];
        }

        for(int i = 0; i < n; i++){
            arr[i] = temp[i];
        }
    }
}