class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> s=new Stack<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(s.empty()){
                ans.add(-1);
                s.push(arr[i]);
            }
            else{
                if(arr[i]>=s.peek()){
                    s.pop();
                    i++;
                }
                else{
                    ans.add(s.peek());
                    s.push(arr[i]);
                }
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}