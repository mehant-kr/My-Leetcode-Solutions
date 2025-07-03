class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int j = 0;
        int i = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                list.add(nums2[j]);
                j++;
            } else {
                list.add(nums1[i]);
                i++;
            }
        }

        // add remaining elements
        while (i < nums1.length) {
            list.add(nums1[i]);
            i++;
        }
        while (j < nums2.length) {
            list.add(nums2[j]);
            j++;
        }
        System.out.println(list);

        int l = list.size();
        if (l%2 != 0) { // odd
            return list.get((l/2));
        } else {
            return (list.get(l/2) + list.get(l/2-1))/2.0;
        }
    }
}