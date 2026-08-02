class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        Arrays.sort(start);
        Arrays.sort(end);
        int i = 0;
        int j = 0;
        int curroom = 0;
        int maxroom = 0;
        while(i < start.length){
            if(start[i]  < end[j]){
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
