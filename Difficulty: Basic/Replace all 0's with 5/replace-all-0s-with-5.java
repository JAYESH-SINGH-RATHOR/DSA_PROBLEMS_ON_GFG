class Solution {
    public int convertFive(int n) {
        // code here
        String  s = Integer.toString(n);
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                res.append('5');
            }
            else {
                    res.append(s.charAt(i));
                }
        }
       return Integer.parseInt(res.toString());
    }
}