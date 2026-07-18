class Solution {
    public int splitArray(int[] nums, int k) {

        //low = array ka sabse bada element
        //Isse kam largest sum kabhi ho hi nhi sakta

        int low = nums[0];

        //hogh = pure aaray ka sum
        //Agar ek hi subarray bne toh largest suum yhi
        int high = 0;
        for(int i = 0; i<nums.length ; i++){
            low = Math.max(low , nums[i]);
                high = high + nums[i];
                 }
                 while(low<=high){
                    int mid = low + (high - low) / 2;
                    if(isPossible(nums, k, mid)){
                        high = mid - 1;

                    
                 }
                 else{
                    low = mid + 1;

                 }
                 }
        return low;
    }
    public boolean isPossible(int[] nums , int k , int maxSum){
        int subArrays = 1;
        int sum = 0;
        for(int i =0; i<nums.length ; i++){

            if(sum + nums[i] > maxSum){
                subArrays++;
                sum = nums[i];
            } else{
                sum = sum + nums[i];
            }
        }
        return subArrays <=  k;
    }
   
}
