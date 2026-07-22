/*class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/

    class Solution {
         static ArrayList<Integer> arr = new ArrayList<>();
    static int index = 0;
        public static void convertToMaxHeapUtil(Node root) {
            // code here
            inorder(root);
            postorder(root);
        }
        public static void inorder(Node root){
            if(root == null){
                return;
            }
        inorder(root.left);
            arr.add(root.data);
            inorder(root.right);
            }
        public static void postorder(Node root){
                if(root == null){
                    return;
                }
        postorder(root.left);
        postorder(root.right);
        root.data = arr.get(index++);
            }
    }