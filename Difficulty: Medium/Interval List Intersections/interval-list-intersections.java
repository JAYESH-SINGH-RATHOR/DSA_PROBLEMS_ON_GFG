class Solution {
    public List<List<Integer>> findIntersection(List<List<Integer>> arr1,
                                                List<List<Integer>> arr2) {
List<List<Integer>> result = new ArrayList<>(); 
    int i = 0 , j = 0;
    while(i < arr1.size() && j < arr2.size()){
        int e1 = arr1.get(i).get(1);
        int e2 = arr2.get(j).get(1);
        int s1 = arr1.get(i).get(0);
        int s2 = arr2.get(j).get(0);
        if(e1 >= s2 && e2 >= s1){
        result.add(Arrays.asList(Math.max(s1, s2), Math.min(e1, e2)));
        }
        if(e1 < e2){
            i++;
        }else{
            j++;
            }
        }
        return result;
     }
}