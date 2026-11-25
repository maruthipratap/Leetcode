class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        int[] targetFreq = new int[128];
        int required = 0;
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (targetFreq[c] == 0) {
                required++;
            }
            targetFreq[c]++;
        }
        int[] windowFreq = new int[128];
        int left = 0;
        int formed = 0;
        int minLen = Integer.MAX_VALUE;
        int bestLeft = 0;
        for (int right = 0; right < s.length(); right++) {
            char rChar = s.charAt(right);
            windowFreq[rChar]++;
            if (targetFreq[rChar] > 0 && windowFreq[rChar] == targetFreq[rChar]) {
                formed++;
            }
            while (left <= right && formed == required) {
                int currentLen = right - left + 1;
                if (currentLen < minLen) {
                    minLen = currentLen;
                    bestLeft = left;
                }
                char lChar = s.charAt(left);
                windowFreq[lChar]--;

                if (targetFreq[lChar] > 0 && windowFreq[lChar] < targetFreq[lChar]) {
                    formed--;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(bestLeft, bestLeft + minLen);
    }
}