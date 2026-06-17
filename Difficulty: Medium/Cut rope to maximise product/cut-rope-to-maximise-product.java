class Solution {
    public int maxProduct(int n) {
        // code here
       if(n == 2){
           return 1;
       }
       if(n == 3){
           return 2;
       }
       int max = 1;
       while(n > 4){
           max *= 3;
           n -= 3;
       }
       return max * n;
    }
}