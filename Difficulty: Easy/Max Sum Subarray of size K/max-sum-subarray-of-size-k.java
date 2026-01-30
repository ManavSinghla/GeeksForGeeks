class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        if(arr.length<k) return -1;
        int ans=0;
        for(int i=0;i<k;i++){
            ans+=arr[i];
        }
        int temp=ans;
        for(int i=k;i<arr.length;i++){
            temp-=arr[i-k];
            temp+=arr[i];
            ans=Math.max(ans,temp);
        }
        return ans;
    }
}