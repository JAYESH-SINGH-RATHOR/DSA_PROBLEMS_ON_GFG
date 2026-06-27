class Solution {
    public char nonRepeatingChar(String s) {
       int n = s.length();
       HashMap<Character , Integer> map = new HashMap<>();
       for(int i = 0; i < n; i++){
           char e = s.charAt(i);
          map.put(e, map.getOrDefault(e, 0) + 1);
       }
    //   System.out.print(map);
       for(int i = 0; i < n; i++){
           char ch = s.charAt(i);
           if(map.get(ch) == 1){
               return ch;
           }
            //   System.out.print("ch wil be " + ch);
       }
       return '$';
    }
}