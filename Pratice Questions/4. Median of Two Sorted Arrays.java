import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m + n];

        int k = 0;
        for (int i = 0; i < m; i++) {
            arr[k] = nums1[i];
            k++;
        }
        for (int i = 0; i < n; i++) {
            arr[k] = nums2[i];
            k++;
        }

        Arrays.sort(arr);
        return (arr.length % 2 == 1 )? arr[arr.length / 2] : (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int nums1[] = {1, 3};
        int nums2[] = {2};

        System.out.println(sol.findMedianSortedArrays(nums1, nums2));
    }
}
