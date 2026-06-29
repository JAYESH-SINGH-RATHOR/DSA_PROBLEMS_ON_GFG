class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int e : arr){
            if(set.contains(e)){
                set.remove(e);
            }
            set.add(e);
        }
        for(int e : set){
            res.add(e);
        }
        Collections.sort(res);
        return res;
    }
}
