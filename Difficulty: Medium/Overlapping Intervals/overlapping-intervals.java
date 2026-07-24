class Solution {
    public ArrayList<ArrayList<Integer>> mergeOverlap(int[][] arr) {
        // Code here
        ArrayList<int[]> list = new ArrayList<>();
        Arrays.sort(arr , (a , b) -> Integer.compare(a[0] , b[0]));
        list.add(arr[0]);
        for(int i = 1; i < arr.length; i++){
            int end[] = list.get(list.size() - 1);
            int start[] = arr[i];
            if(start[0] <= end[1]){
                start[0] = Math.min(start[0] , end[0]);
                end[1] = Math.max(start[1] , end[1]);
            }else{
                list.add(arr[i]);
            }
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int e[] : list){
            ArrayList<Integer> row = new ArrayList<>();
            row.add(e[0]);
            row.add(e[1]);
            res.add(row);
        }
        return res;
    }
}