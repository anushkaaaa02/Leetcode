class Solution {
    public String longestPalindrome(String s) {
     

        // Single character ya empty string khud hi palindrome hai
        if (s == null || s.length() < 2)
            return s;

        // Longest palindrome ki starting aur ending index
        int start = 0;
        int end = 0;

        // Har character ko center maan kar palindrome expand karenge
        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome (center = i)
            int len1 = expand(s, i, i);

            // Even length palindrome (center = i, i+1)
            int len2 = expand(s, i, i + 1);

            // Dono me se maximum length
            int len = Math.max(len1, len2);

            // Agar naya palindrome bada hai to answer update karo
            if (len > end - start + 1) {

                // New starting index
                start = i - (len - 1) / 2;

                // New ending index
                end = i + len / 2;
            }
        }

        // Longest palindromic substring return karo
        return s.substring(start, end + 1);
    }

    // Center se left aur right expand karke palindrome ki length return karta hai
    private int expand(String s, int left, int right) {

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        // Loop ke baad left aur right ek step bahar nikal chuke hote hain
        return right - left - 1;
    }
}
   