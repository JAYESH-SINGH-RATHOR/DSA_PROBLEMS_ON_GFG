class Solution {
    String modify(String s) {

        StringBuilder sb = new StringBuilder(s);

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !isvowel(sb.charAt(left))) {
                left++;
            }

            while (left < right && !isvowel(sb.charAt(right))) {
                right--;
            }

            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);

            left++;
            right--;
        }

        return sb.toString();
    }

    boolean isvowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }
}