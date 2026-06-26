class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder res = new StringBuilder(s);
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char temp = res.charAt(left);
            res.setCharAt(left, res.charAt(right));
            res.setCharAt(right, temp);
            left++;
            right--;
        }
    return res.toString();
    }
}