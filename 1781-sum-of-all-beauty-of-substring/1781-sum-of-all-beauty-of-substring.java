class Solution {
    public int beautySum(String s) {

        int n = s.length();
        int ans = 0;

        // Har substring ke starting index ko fix karte hain
        for (int i = 0; i < n; i++) {

            // Current substring ke characters ki frequency
            int[] freq = new int[26];

            // Ending index ko aage badhate hain
            for (int j = i; j < n; j++) {

                // Naya character substring me add hua
                freq[s.charAt(j) - 'a']++;

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                // 26 characters ki frequency check karo
                for (int k = 0; k < 26; k++) {

                    // Sirf jo characters present hain unhe consider karo
                    if (freq[k] > 0) {

                        maxFreq = Math.max(maxFreq, freq[k]);
                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }

                // Current substring ki beauty add karo
                ans += (maxFreq - minFreq);
            }
        }

        return ans;
    }
}