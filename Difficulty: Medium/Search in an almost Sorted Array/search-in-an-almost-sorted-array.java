// User function Template for Java
class Solution {
    public int findTarget(int arr[], int target) {
        // code here
        int low=0;
        int high=arr.length-1;
        while(high>=low){
            int mid=low+(high-low)/2;
            if(arr[mid]==target) return mid;
            else if(arr.length-1>mid && arr[mid+1]==target) return mid+1;
            else if(mid>0 && arr[mid-1]==target) return mid-1;
            else if(arr[mid]>target){
                    high=mid-1;
            }
            else{
                    low=mid+1;
            }
        }
        return -1;
    }
}