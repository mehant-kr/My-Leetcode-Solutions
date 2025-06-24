class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int pivot = nums[0];
        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] >= nums[0]) {
                pivot = mid;
                // 4 5 6 7 8 0 1
                //.l       l ^ r
                // [4,5,6,7,0,1,2]
                left = mid + 1;
            } else
                right = mid - 1;
        }
        int res = binarySearch(nums, target, 0, pivot);
        if (res == -1) {
            res = binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
        return res;

    }

    private int binarySearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            if (target < nums[mid]) {
                right = mid - 1;
            } else
                left = mid + 1;
        }
        return -1;
    }
}