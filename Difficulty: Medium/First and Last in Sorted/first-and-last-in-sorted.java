class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int first = findFirst(arr, x);
        int last = findLast(arr , x);
        ArrayList<Integer> res = new ArrayList<>();
        res.add(first);
        res.add(last);
        return res;
    }
    int findFirst(int arr[] , int t){
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == t){
                ans = mid;
                right = mid - 1;
            }else if(arr[mid] < t){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
    int findLast(int arr[] , int t){
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == t){
                ans = mid;
                left = mid + 1;
            }else if(arr[mid] < t){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
}
