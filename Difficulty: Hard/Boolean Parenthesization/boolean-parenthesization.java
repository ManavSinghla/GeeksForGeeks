class Solution {

    static HashMap<String, Long> memo;

    static long solve(String s, int i, int j, boolean isTrue) {

        String key = i + " " + j + " " + isTrue;

        if (memo.containsKey(key))
            return memo.get(key);

        // Base case
        if (i > j)
            return 0;

        if (i == j) {
            if (isTrue)
                return s.charAt(i) == 'T' ? 1 : 0;
            else
                return s.charAt(i) == 'F' ? 1 : 0;
        }

        long ways = 0;

        for (int k = i + 1; k <= j - 1; k += 2) {

            long lt = solve(s, i, k - 1, true);
            long lf = solve(s, i, k - 1, false);
            long rt = solve(s, k + 1, j, true);
            long rf = solve(s, k + 1, j, false);

            char op = s.charAt(k);

            if (op == '&') {
                if (isTrue)
                    ways += lt * rt;
                else
                    ways += lt * rf + lf * rt + lf * rf;
            }

            else if (op == '|') {
                if (isTrue)
                    ways += lt * rt + lt * rf + lf * rt;
                else
                    ways += lf * rf;
            }

            else if (op == '^') {
                if (isTrue)
                    ways += lt * rf + lf * rt;
                else
                    ways += lt * rt + lf * rf;
            }
        }

        memo.put(key, ways);
        return ways;
    }

    static int countWays(String s) {

        memo = new HashMap<>();

        return (int) solve(s, 0, s.length() - 1, true);
    }
}
