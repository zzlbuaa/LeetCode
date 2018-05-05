class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        int lo = 0;
        int hi = matrix.length * matrix[0].length - 1;
        int mid = lo + (hi - lo) / 2;
        while(matrix[mid/matrix[0].length][mid%matrix[0].length] != target) {
            if(lo >= hi) return false;
            else if(matrix[mid/matrix[0].length][mid%matrix[0].length] > target) {
                hi = mid - 1;
                mid = lo + (hi - lo) / 2;
            }
            else
            {
                lo = mid + 1;
                mid = lo + (hi - lo) / 2;
            }
        }
        return true;
    }
}
