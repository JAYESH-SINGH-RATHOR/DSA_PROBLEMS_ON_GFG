class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer>res = new ArrayList<>();
       int max = arr[arr.length - 1];
       res.add(max);
       for(int i = arr.length - 2; i >= 0; i--){
           if(arr[i] >= max){
               max = arr[i];
               res.add(max);
           }
       }
       Collections.reverse(res);
       return res;
    }
}
