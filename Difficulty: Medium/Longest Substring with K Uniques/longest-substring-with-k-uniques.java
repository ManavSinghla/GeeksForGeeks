class Solution {
    public int longestKSubstr(String s, int k) {
        int i = 0, j = 0;
        int mx = -1;

        HashMap<Character, Integer> mp = new HashMap<>();

        while (j < s.length()) {

            char ch = s.charAt(j);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);

            if (mp.size() < k) {
                j++;
            }
            else if (mp.size() == k) {
                mx = Math.max(mx, j - i + 1);
                j++;
            }
            else {
                while (mp.size() > k) {
                    char leftChar = s.charAt(i);
                    mp.put(leftChar, mp.get(leftChar) - 1);
                    if (mp.get(leftChar) == 0) {
                        mp.remove(leftChar);
                    }
                    i++;
                }
                j++;
            }
        }

        return mx;
    }
}