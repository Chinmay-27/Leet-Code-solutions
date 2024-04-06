import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Loop through each element in nums2
        for (int j = 0, i = m; j < n; j++) {
            // Copy each element from nums2 to the end of nums1
            nums1[i] = nums2[j];
            // Increment the index i to point to the next available slot in nums1
            i++;
        }
        // Sort the merged array nums1
        Arrays.sort(nums1);
    }
}
