class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int nums[]) {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum)) {
                count += map.get(sum);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        if(count>=1) return true;
        return false;
    }
}