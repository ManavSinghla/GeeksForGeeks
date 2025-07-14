// User function Template for Java

class Solution {
    int findMaxSum(int arr[]) {
        // code here
        int n=arr.length;
        int[] ans=new int[n];
        ans[0]=arr[0];
        ans[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            ans[i]=Math.max(ans[i-1],arr[i]+ans[i-2]);
        }
        return ans[n-1];
    }
}