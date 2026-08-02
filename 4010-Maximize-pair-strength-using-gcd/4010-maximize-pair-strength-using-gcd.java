class Solution {
    public long maxPairStrength(int[] nums) {
        int n = nums.length;
        long ans = 0;

        for(int i = 0 ;i < n ; i++){
            for(int j = i+1; j< n; j++){
                long a = nums[i];
                long b = nums[j];
                long g = gcd(a,b);

                long strength = (a / g) * (b / g);

                ans = Math.max(ans, strength);
            }
        }
        return ans;
    }
    private long gcd (long a, long b){
        while(b != 0){
            long temp = b;
            b = a % b ;
            a = temp;
        }
        return a;
    }
}
