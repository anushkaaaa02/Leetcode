class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
    //      int[] factors = {2};
    // for(int factor:factors){
    //     while(n%factor == 0){
    //         n=n/2;
    //     }
    // } 
    // return n == 1;
    while(n %2 == 0){
        n = n/2;
    }
    return n ==1;
    }
}