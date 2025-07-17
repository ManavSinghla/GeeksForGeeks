// User function Template for Java

class Solution {
    static int knapSack(int val[], int wt[], int capacity) {
        // code here
        int n=val.length;
        int m=capacity;
        int[][] ans=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(wt[i-1]>j){
                    ans[i][j]=ans[i-1][j];
                }
                else{
                    ans[i][j]=Math.max(ans[i-1][j],ans[i][j-wt[i-1]]+val[i-1]);
                }
            }
        }
        return ans[n][m];
    }
}