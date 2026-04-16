class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countMax = Integer.MIN_VALUE;
        int count = 0;
        for(int i : nums) {
            if(i == 1) {
                count++;
            } else {
                count = 0;
            }
            countMax = Math.max(count, countMax);
        }
        return countMax;
    }
}