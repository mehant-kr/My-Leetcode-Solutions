class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int res = nums[0];
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= nums[left]) {
                res = Math.min(res, nums[left]);
                left = mid + 1;
            } else {
                res = Math.min(res, nums[mid]);
                right = mid - 1;
            }
            // 4 5 0 1 2 3 4 
            //         l ^ r
            // 3 1 2
        } return res;
    }
}