class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(arr);
        int left = 0;
        int right =  1;
        int count = 0;
        while(right < arr.length){
            if(arr[left] == arr[right]){
                res.add(arr[left]);
            
            while(right < arr.length && arr[left] < arr[right]){
                right++;
            }
            left = right;
            right++;
            }
            else{
                left++;
                right++;
            }
            
    }
            return res;
}
}