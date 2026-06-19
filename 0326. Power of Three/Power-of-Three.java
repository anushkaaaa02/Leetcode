class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        int[] factors = {3};
        for(int factor:factors){
            while(n%3==0){
                n=n/3;
            }
        }
        return n==1;
    }
}