
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<a.length;i++){
            ans.put(a[i],ans.getOrDefault(a[i],0)+1);
        }
        for(int i=0;i<b.length;i++){
             if(ans.containsKey(b[i]) && ans.get(b[i]) > 0){
                 ans.put(b[i], ans.get(b[i]) - 1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
