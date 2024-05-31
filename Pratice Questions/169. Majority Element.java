public class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int ele = nums[0];

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                ele = nums[i];
            }
            if (nums[i] == ele) {
                count++;
            } else {
                count--;
            }
        }

        // Verify that the element is the majority element
        int m = 0;
        for (int i : nums) {
            if (i == ele) {
                m++;
            }
        }
        return (m > n / 2) ? ele : -1;
    }
}