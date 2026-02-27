// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

/* Should return minimum distance between a and b
   in a tree with given root*/
class GfG {
    int findDist(Node root, int a, int b) {
        Node val = lca(root , a , b);
        int dist1 = lcadist(val , a);
        int dist2 = lcadist(val , b);
        return dist1 + dist2;
    }
    
    int lcadist(Node root , int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int ld = lcadist(root.left , n);
        int rd = lcadist(root.right , n);
        
        if(ld == -1 && rd == -1){
            return -1;
        }
        else if(ld == -1){
            return rd + 1;
        }
        else{
            return ld + 1;
        }
    }

    Node lca(Node root , int n1 , int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node lh = lca(root.left , n1 , n2);
        Node rh = lca(root.right , n1 , n2);
        
        if(lh == null){
            return rh;
        }
        if(rh == null){
            return lh;
        }
        return root;
    }
}