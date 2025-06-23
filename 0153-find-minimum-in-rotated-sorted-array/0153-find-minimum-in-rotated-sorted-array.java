class Solution {
    public int findMin(int[] nums) {
        // int min = nums[0];
        // int temp = nums[0];
        // for (int i = 0; i < nums.length; i++) {
        //     nums[i] = nums[i + 1];
        // }
        // nums[nums.length - 1] = temp;
        return Arrays.stream(nums).min().getAsInt();
    }
}