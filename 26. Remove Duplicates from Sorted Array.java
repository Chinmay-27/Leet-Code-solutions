class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // If the array is empty, there are no duplicates.
        }
        
        int uniqueCount = 1; // At least one unique element (the first one).
        
        // Iterate through the array starting from the second element.
        for (int i = 1; i < nums.length; i++) {
            // Check if the current element is different from the previous one.
            if (nums[i] != nums[i - 1]) {
                // Increment the uniqueCount and update the element at that position.
                uniqueCount++;
                nums[uniqueCount - 1] = nums[i];
            }
        }
        
        return uniqueCount;
    }
}
