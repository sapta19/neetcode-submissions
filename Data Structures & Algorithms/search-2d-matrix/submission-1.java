class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0) return false;
        int row = matrix.length;
        int col = matrix[0].length;
        int low = 0;
        int high = row * col - 1;
        int mid , midValue;

        while (low <= high) {

            mid = low + (high - low) / 2;
            midValue = matrix[mid / col][mid % col];

            if(midValue == target ){
                return true;
            }

            if(midValue > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return false;
    }
}
