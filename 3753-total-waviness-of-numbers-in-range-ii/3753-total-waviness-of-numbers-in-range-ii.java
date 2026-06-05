
class Solution {
    static class Pair {
        long cnt;
        long wave;
        Pair(long c, long w) {
            cnt = c;
            wave = w;
        }
    }

    String s;
    HashMap<String, Pair> memo;

    public long totalWaviness(long num1, long num2) {
        return solve(num2) - solve(num1 - 1);
    }

    private long solve(long x) {
        if (x <= 0) return 0;
        s = String.valueOf(x);
        memo = new HashMap<>();
        return dfs(0, 1, 0, 10, 10, 0).wave;
    }

    private Pair dfs(int pos, int tight, int len, int prev2, int prev1, int started) {
        if (pos == s.length()) {
            return new Pair(started == 1 ? 1 : 0, 0);
        }

        String key = pos + "|" + tight + "|" + len + "|" + prev2 + "|" + prev1 + "|" + started;

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int limit = tight == 1 ? s.charAt(pos) - '0' : 9;
        long totalCnt = 0;
        long totalWave = 0;

        for (int d = 0; d <= limit; d++) {
            int ntight = (tight == 1 && d == limit) ? 1 : 0;

            if (started == 0 && d == 0) {
                Pair child = dfs(pos + 1, ntight, 0, 10, 10, 0);
                totalCnt += child.cnt;
                totalWave += child.wave;
            } else if (started == 0) {
                Pair child = dfs(pos + 1, ntight, 1, 10, d, 1);
                totalCnt += child.cnt;
                totalWave += child.wave;
            } else {
                int add = 0;
                if (len >= 2) {
                    if ((prev2 < prev1 && prev1 > d) || (prev2 > prev1 && prev1 < d)) {
                        add = 1;
                    }
                }
                Pair child = dfs(pos + 1, ntight, len + 1, prev1, d, 1);
                totalCnt += child.cnt;
                totalWave += child.wave + (add * child.cnt);
            }
        }

        Pair ans = new Pair(totalCnt, totalWave);
        memo.put(key, ans);
        return ans;
    }
}                            