 class Solution{
    public int countDigits(int nums){
        int count = 0;
        int original = nums;
        while(nums>0){
            int digit = nums % 10;
            if(digit !=0 && original % digit == 0){
                count++;
            }
            nums = nums / 10;
        }
        return count;
    }
}