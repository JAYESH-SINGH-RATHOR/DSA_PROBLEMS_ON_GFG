class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        
        
        // bruteforce appraoch
        
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = i + 1; j < arr.length; j++){
        //         if(arr[i] == arr[j] ){
        //             list.add(arr[i]);
        //         }
        //     }
        // }
        // return list;
        
        //optimized appraoch
        
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res =new ArrayList<>();
        for(int  i = 0; i < arr.length; i++){
            if(set.contains(arr[i])){
                res.add(arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }
        return res;
    }
}