// User function Template for Java

class Solution {
    public boolean checkDuplicates(int arr[]) {
        // Code here
       HashSet<Integer > set = new HashSet<>();
       for(int e : arr){
           if(set.contains(e)){
               return true;
           }
           set.add(e);
       }
       return false;
    }
}