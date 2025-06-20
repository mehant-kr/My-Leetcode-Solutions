class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        // System.out
        System.out.println("right::" + right);
        int max = 0;
        int compare;

        while (left < right) {
            compare = (right-left)*(Math.min(height[left], height[right]));
            max = Math.max(max, compare);
            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                right--;
            }
            System.out.println("left: " + left);
            System.out.println("right: " + right);
        }
        return max;
    }
}