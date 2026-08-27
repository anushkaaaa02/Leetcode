class Solution {
    public int numPrimeArrangements(int n) {
        int mod = 1000000007;
        boolean[] prime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i]) count++;
        }

        long ans = 1;

        for (int i = 1; i <= count; i++) {
            ans = ans * i % mod;
        }

        for (int i = 1; i <= n - count; i++) {
            ans = ans * i % mod;
        }

        return (int) ans;
    }
}