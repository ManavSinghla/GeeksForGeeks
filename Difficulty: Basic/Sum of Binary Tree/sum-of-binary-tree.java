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
    static void fun(int[] a,Node root){
        if(root == null ) return;
        a[0]+=root.data;
        fun(a,root.left);
        fun(a,root.right);
    }
    static int sumBT(Node root) {
        int[] a={0};
        fun(a,root);
        return a[0];
    }
}