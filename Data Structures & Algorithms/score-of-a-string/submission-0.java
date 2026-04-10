class Solution {
    public int scoreOfString(String s) {
        int i = 0, j = 1;
        int score = 0;
        while(i < s.length() && j < s.length()) {
            score += Math.abs(s.charAt(i) - s.charAt(j));
            i++;
            j++;
        }
        return score;
    }
}