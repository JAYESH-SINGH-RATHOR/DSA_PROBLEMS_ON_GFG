/* Structure of Height
class Height {
    int feet;
    int inches;

    // Constructor to initialize the Height object
    Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }
}
*/
class Solution {
    public int findMax(ArrayList<Height> arr) {
        // code here
        int max = 0;
        for(int i = 0; i < arr.size(); i++){
            int inch = arr.get(i).feet * 12;
            int sum = inch + arr.get(i).inches;
            max = Math.max(max , sum);
        }
        return max;
    }
}