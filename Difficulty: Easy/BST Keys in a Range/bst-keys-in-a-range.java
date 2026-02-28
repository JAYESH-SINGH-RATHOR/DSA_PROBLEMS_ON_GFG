class Solution {
    public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {
        ArrayList<Integer> res = new ArrayList<>();
        
        if (root == null) {
            return res;
        }
        if (root.data > low) {
            res.addAll(printNearNodes(root.left, low, high));
        }
        if (root.data >= low && root.data <= high) {
            res.add(root.data);
        }
        if (root.data < high) {
            res.addAll(printNearNodes(root.right, low, high));
        }

        return res;
    }
}