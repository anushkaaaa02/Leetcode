class Solution {
    public boolean isPowerOfFour(int n) {

        if(n<=0){
            return false;
        }
        int[] factors = {4};
        for(int factor:factors){
            while(n%4==0){
                n=n/4;
            }
        }
        return n == 1;
        
    }
}
