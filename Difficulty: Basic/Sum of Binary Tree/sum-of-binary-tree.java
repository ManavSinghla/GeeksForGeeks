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
    // Function to return sum of all nodes of a binary tree
    static void fun(int[] ans,Node root){
        if(root==null) return;
        ans[0]+=root.data;
        fun(ans,root.left);
        fun(ans,root.right);
    }
    static int sumBT(Node root) {
        // Your code here
        int[] ans=new int[1];
        fun(ans,root);
        return ans[0];
    }
}