class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int n = s.length() - 1;
        int length = 0;
        while(n >= 0) {
            if(s.charAt(n) == ' ' && n != 0) {
                return length;
            }
            length++;
            n--;
        }
        return length;
    }
}