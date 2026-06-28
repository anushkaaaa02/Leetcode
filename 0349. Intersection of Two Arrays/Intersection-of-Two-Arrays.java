import java.util.HashSet;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> output = new HashSet<>();
        for(int arr : nums1){
             set.add(arr);
        }   
         for(int arr : nums2){
            if(set.contains(arr)){
                output.add(arr);
            }
         }
          int[] ans = new int[output.size()];
          int i = 0;

          for(int num : output){
            ans[i++] = num;
          }   
          return ans;    

        
    }
}
