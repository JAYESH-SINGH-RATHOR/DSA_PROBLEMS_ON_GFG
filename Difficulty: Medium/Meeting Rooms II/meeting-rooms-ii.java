class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        Arrays.sort(start);
        Arrays.sort(end);
        int maxroom = 0;
        int curroom  = 0;
        int i = 0;
        int j = 0;
        int n = start.length;
        while(i < n){
            if(start[i] < end[j]){
                curroom++;
                i++;
            }else{
                curroom--;
                j++;
            }
            maxroom = Math.max(maxroom , curroom);
        }
        return maxroom;
    }
}
