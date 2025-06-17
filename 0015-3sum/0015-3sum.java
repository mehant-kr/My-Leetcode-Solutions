class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // sorting the arrays
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        // loop for 1st
        int sum = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            // checking for duplicates
            if (i > 0 && nums[i] == nums[i-1]) continue;
            // next two
            // -8, -3, -3, -4, 1, 7
            //  F   L.            R. 
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                sum = nums[i] + nums[l] + nums[r];
                if (sum < 0) { // to increase the sum move l right 
                    l++;
                } else if (sum > 0)
                    r--;
                else {
                    list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++; 
                    // check for duplicates, it might add a duplicate in the 'list'
                    while (nums[l] == nums[l-1] && l < r) l++;
                }
            }
        }
        return list;
    }
}