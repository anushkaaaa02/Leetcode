class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        //puri matrix ko 1 D sorted array maanle
        int low = 0;
        int high = rows * cols - 1;

        while(low<=high){
            int mid = low + (high - low)/2;
 
            //1D ko 2D m convert kr

            int row = mid / cols;
            int col = mid % cols;

            int element =matrix[row][col];

            if (element == target){
                return true;
            }
            else if(element < target){
                low = mid + 1;

            } else{
                high = mid - 1;
            }
        }
        return false;
    }
}