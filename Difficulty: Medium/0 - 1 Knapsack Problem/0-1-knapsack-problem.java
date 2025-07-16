class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        int m=W;
        int n=val.length;
        int[][] ans=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(wt[i-1]>j){
                    ans[i][j]=ans[i-1][j];
                }
                else{
                    ans[i][j]=Math.max(ans[i-1][j],ans[i-1][j-wt[i-1]]+val[i-1]);
                }
            }
        }
        return ans[n][m];
    }
}
