class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        Deque<Integer> d=new ArrayDeque<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<k;i++){
            if(arr[i]<0) d.offerLast(i);
        }
        if(d.isEmpty()) ans.add(0);
        else{
            ans.add(arr[d.peekFirst()]);
        }
        for(int i=k;i<arr.length;i++){
            while(!d.isEmpty() && d.peekFirst()<=i-k){
                d.pollFirst();
            }
            if(arr[i]<0) d.offerLast(i);
            if(d.isEmpty()) ans.add(0);
            else{
                ans.add(arr[d.peekFirst()]);
            }
        }
        return ans;
    }
}