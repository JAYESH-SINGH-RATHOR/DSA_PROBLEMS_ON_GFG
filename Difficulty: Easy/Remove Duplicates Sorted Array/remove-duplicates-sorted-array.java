class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        list.add(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(arr[left] != arr[i]){
                list.add(arr[i]);
                left = i;
            }
        }
        return list;
    }
}
