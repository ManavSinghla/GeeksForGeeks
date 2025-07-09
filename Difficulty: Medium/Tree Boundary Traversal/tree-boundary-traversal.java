/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    boolean isLeaf(Node node){
        return node.left==null && node.right==null;
    }
    
    void left(ArrayList<Integer> ans,Node node){
        if(node==null || isLeaf(node)){
            return;
        }
        ans.add(node.data);
        if(node.left!=null){
            left(ans,node.left);
        }
        else{
            left(ans,node.right);
        }
    }
    
    void leaf(ArrayList<Integer> ans,Node node){
        if(node==null){
            return;
        }
        if(isLeaf(node)){
            ans.add(node.data);
        }
        leaf(ans,node.left);
        leaf(ans,node.right);
    }
    
    void right(ArrayList<Integer> ans, Node node){
        if(node==null || isLeaf(node)){
            return;
        }
        if(node.right!=null){
            right(ans,node.right);
        }
        else{
            right(ans,node.left);
        }
        ans.add(node.data);
    }
    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        if(node == null) return ans;
        if(!isLeaf(node)) ans.add(node.data);
        
        left(ans,node.left);
        leaf(ans,node);
        right(ans,node.right);
        return ans;
    }
}