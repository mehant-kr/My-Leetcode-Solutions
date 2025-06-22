class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int output = right;

        while (left <= right) {
            int b = 0;
            int mid = (left + right) / 2;
            for (int pile : piles) {
                b += Math.ceil((double) pile / mid);
            }
            if (b <= h) {
                output = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return output;
    }
}