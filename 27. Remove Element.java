class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Initialize the variable to keep track of the count of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move non-val elements to the front of the array
                k++;
            }
        }

        return k; // k represents the count of elements not equal to val, and it's also the new length of the modified array
    }
}
