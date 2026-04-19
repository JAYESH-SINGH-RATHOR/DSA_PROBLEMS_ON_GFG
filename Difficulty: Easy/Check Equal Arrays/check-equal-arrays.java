class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        int n = a.length;
        int m = b.length;
        if(a.length != b.length){
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i < n; i++){
                if(a[i] != b[i]){
                    return false;
                }
        }
        return true;
    }
}