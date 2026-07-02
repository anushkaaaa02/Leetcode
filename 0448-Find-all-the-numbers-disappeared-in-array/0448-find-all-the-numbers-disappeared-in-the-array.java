class Solution{
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] freq = new int[nums.length + 1];
        for(int num : nums){
            freq[num]++;
        }
        for(int i = 1; i < freq.length; i++){
            if(freq[i] == 0){
                result.add(i);
            }
        }
        return result;
    }
}