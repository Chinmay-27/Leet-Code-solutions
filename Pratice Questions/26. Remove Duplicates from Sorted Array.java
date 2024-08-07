class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        
        int unq_count = 1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]){
                unq_count++;
                nums[unq_count - 1] = nums[i];
            }
        }
        return unq_count;
    }   
}