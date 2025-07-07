/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    void fun(int[] ans,Node node){
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            ans[0]++;
        }
        fun(ans,node.left);
        fun(ans,node.right);
        
    }
    int countLeaves(Node node) {
        // Your code
        int[] ans=new int[1];
        ans[0]=0;
        fun(ans,node);
        return ans[0];
    }
}