class Solution {
    boolean check(int[] arr,int k,int mid){
        int sum=0;
        int c=1;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>mid){
                sum=0;
                c++;
            }
            sum+=arr[i];
        }
        return k>=c;
    }
    public int minTime(int[] arr, int k) {
        // code here
        if(arr.length<k) return -1;
        int low=arr[0];
        int high=arr[0];
        for(int i=1;i<arr.length;i++){
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        int ans=-1;
        while(high>=low){
            int mid=low+(high-low)/2;
            if(check(arr,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
