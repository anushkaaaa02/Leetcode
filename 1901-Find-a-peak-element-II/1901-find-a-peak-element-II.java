class Solution {
    public int findMaxRow(int[][] mat , int col){
        int maxRow = 0;
        for(int row = 1; row<mat.length; row++){
            if(mat[row][col] > mat [maxRow][col]){
                maxRow = row;
            }
            }
            return maxRow;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int low = 0;
        int high = m - 1;

        while(low<=high){
            int mid = low + (high - low )/ 2;

            int maxRow = findMaxRow(mat , mid);
            int left = -1;
            int right = -1;
            if(mid - 1 >= 0){
                left = mat[maxRow][mid - 1];
            }

            if(mid + 1 < m){
                right = mat[maxRow][mid + 1];
            }
            int current = mat[maxRow][mid];

            if(current > left && current > right){
                return new int []{maxRow , mid} ;
            }
            else if (left > current){
                high = mid - 1;

            }
            else{
                low = mid + 1;
            }
        }
        return new int[] {-1 , -1};
    }
}