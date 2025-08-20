/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    void fun(int[] a,Node root){
        if(root==null) return;
        if(root.left==null && root.right==null) a[0]++;
        fun(a,root.left); 
        fun(a,root.right); 
    }
    int countLeaves(Node root) {
        int[] a={0};
        fun(a,root);
        return a[0];
        // Your code
    }
}