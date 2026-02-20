/*class Node of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/
class Solution {

    public ArrayList<Integer> Ancestors(Node root, int target) {
        // add your code here
        ArrayList<Integer> res = new ArrayList<>();
        find(root,target,res);
        return res;
    }
    public static boolean find(Node root , int target , ArrayList<Integer>res){
        if(root == null){
            return false;
        }
        if(root.data == target){
            return true;
        }
       if(find(root.left , target , res) || find(root.right , target , res)){
           res.add(root.data);
       return true;
       }
    return false;
    }
}