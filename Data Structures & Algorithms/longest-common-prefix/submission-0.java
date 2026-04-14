class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length = strs[0].length();
        String prefix = strs[0];
        for(String s : strs) {
            length = Math.min(length, s.length());
            while(length > 0 && !s.substring(0, length).equals(prefix.substring(0, length))) {
                length--;
            }
        }
        return prefix.substring(0, length);
    }
}