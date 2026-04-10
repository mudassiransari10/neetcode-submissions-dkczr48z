class Solution {
    public int scoreOfString(String s) {
        int i = 0;
        int score = 0;
        while(i < s.length() - 1) {
            score += Math.abs(s.charAt(i) - s.charAt(i+1));
            i++;
        }
        return score;
    }
}