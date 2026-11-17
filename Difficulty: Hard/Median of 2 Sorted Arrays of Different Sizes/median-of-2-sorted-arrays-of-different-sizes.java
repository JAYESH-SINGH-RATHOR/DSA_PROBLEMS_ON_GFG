class Solution {
    public double medianOf2(int a[], int b[]) {
        // Code Here
        int left = 0;
        int right = 0;
        int n = a.length;
        int m = b.length;
        int merge[] = new int[n + m];
        int idx = 0;
        while(left < n && right < m){
            if(a[left] < b[right]){
                merge[idx++] = a[left++];
            }else{
                merge[idx++] = b[right++];
            }
        }
        while(left < n){
            merge[idx++] = a[left++];
        }
        while(right < m){
            merge[idx++] = b[right++];
        }
        int totallength = merge.length;
        if(totallength % 2 == 1){
            return merge[totallength / 2];
        }else{
            return (merge[totallength / 2] + merge[totallength / 2 - 1]) / 2.0;
        }
    }
}