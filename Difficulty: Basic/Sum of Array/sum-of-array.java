// User function Template for Java

class Solution {
    void fun(int[] ans,int[] nums,int i){
        if(i==nums.length) return;
        ans[0]+=nums[i];
        fun(ans,nums,i+1);
    }
    int arraySum(int[] nums) {
        int[] ans={0};
        fun(ans,nums,0);
        return ans[0];
    }
}
