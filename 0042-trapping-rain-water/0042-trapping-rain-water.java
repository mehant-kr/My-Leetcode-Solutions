class Solution {
    public int trap(int[] height) {
        int l = height.length;
        int left = 0;
        int right = l - 1;
        int water = 0;
        int maxL = height[left];
        int maxR = height[right];

        while (left <= right) {
            int i = 0;
            if (maxL <= maxR) {
                int w = maxL - height[left];
                water = (w < 0) ? water + 0 : water + w;
                maxL = Math.max(maxL, height[left]);
                left++;
            } else {
                int w = maxR - height[right];

                water = (w < 0) ? water + 0 : water + w;
                maxR = Math.max(maxR, height[right]);
                right--;
            }
            // formula
            // min(left, right) - h[i]
        }
        return water;
    }
}

// 12-2-1 = 9