/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    static void fun(int[] ans,Node root){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            ans[0]+=root.data;
        }
        fun(ans,root.left);
        fun(ans,root.right);
    }
    // Function to return sum of all nodes of a binary tree
    static int leafSum(Node root) {
        // Your code here
        int[] ans=new int[1];
        ans[0]=0;
        fun(ans,root);
        return ans[0];
    }
}