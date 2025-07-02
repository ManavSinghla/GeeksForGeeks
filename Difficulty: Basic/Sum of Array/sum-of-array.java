// User function Template for Java

class Solution {
    int i=-1;
    int arraySum(int arr[]) {
        // code here
        if(i>=arr.length-1){
            return 0;
        }
        i++;
        return arr[i]+arraySum(arr);
    }
}
