// User function Template for Java//User function Template for Java
class Solution {
    static void fun(int[] arr,ArrayList<Integer> res,int i,int currsum){
        if(i== arr.length){
            res.add(currsum);
            return;
        }
        // Include.
        fun(arr,res,i+1,currsum+arr[i]);
        // Exclude.
        fun(arr,res,i+1,currsum);
    }
    
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        fun(arr,res,0,0);
        return res;
        
        
    }
}