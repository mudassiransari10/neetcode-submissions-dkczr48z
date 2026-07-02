class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 1;
        while(left < nums.length && right < nums.length) {
            if(nums[left] == 0) {
                if(nums[right] > 0) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                }
            } else {
                left++;
            }
            right++;
        }
    }
}