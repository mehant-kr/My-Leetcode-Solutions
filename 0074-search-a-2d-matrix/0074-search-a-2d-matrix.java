class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = matrix.length;
        int left = 0;
        int right = matrix.length-1;

        while (left <= right) {
            int mid = (right + left)/2;
            int mid_l = matrix[mid].length-1;
            // if target is in middle row
            if (target >= matrix[mid][0] && target <= matrix[mid][mid_l]) {
                // binary search for this row
                return binarySearch(matrix[mid], target);
            } 
            // if target is greater then middle
            else if (target > matrix[mid][mid_l]) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return false;
    }
    private boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        while (left <= right){
            int mid = (right+left)/2;
            if (target == arr[mid]) return true;
            if (target < arr[mid]) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return false;
    }
}