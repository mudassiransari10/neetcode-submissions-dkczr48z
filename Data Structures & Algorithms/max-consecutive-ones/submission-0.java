class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countMax = Integer.MIN_VALUE;
        int count = 0;
        Math.max(count, countMax);
        int n = 0;
        while(n < nums.length) {
            if(nums[n] == 1) {
                count++;
            } else if(nums[n] == 0) {
                count = 0;
            }
            countMax = Math.max(count, countMax);
            n++;
        }
        return countMax;
    }
}