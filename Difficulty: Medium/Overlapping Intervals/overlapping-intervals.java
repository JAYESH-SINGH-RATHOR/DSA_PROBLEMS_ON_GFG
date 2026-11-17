class Solution {
    public ArrayList<ArrayList<Integer>> mergeOverlap(int[][] arr) {
        // Code here
        ArrayList<int[]> res = new ArrayList<>();
        Arrays.sort(arr , (a , b) -> a[0] - b[0]);
        res.add(arr[0]);
        for(int i = 0; i < arr.length; i++){
            int s[] = arr[i];
            int e[] = res.get(res.size() - 1);
            if(s[0] <= e[1]){
                s[0] = Math.min(s[0] , e[0]);
                e[1] = Math.max(s[1] , e[1]);
            }else{
                res.add(arr[i]);
            }
        }
      ArrayList<ArrayList<Integer>> ress = new ArrayList<>();
            for(int e[] : res){
                ArrayList<Integer> row = new ArrayList<>();
                row.add(e[0]);
                row.add(e[1]);
                ress.add(row);
            }
            return ress;
    }
}