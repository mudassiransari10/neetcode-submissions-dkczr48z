class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countMax = 0;
        int count = 0;
        for(int i : nums) {
            if(i == 1) {
                count++;
                if(count > countMax) {
                    countMax = count;
                }
            } else {
                count = 0;
            }
        }
        return countMax;
    }
}