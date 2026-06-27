class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        StringBuffer s = new StringBuffer();
        while(true) {
            if(i < word1.length()) {
                s.append(word1.charAt(i));
                i++;
            } else {
                s.append(word2.substring(j, word2.length()));
                return s.toString();
            }
            if(j < word2.length()) {
                s.append(word2.charAt(j));
                j++;
            } else {
                s.append(word1.substring(i, word1.length()));
                return s.toString();
            }
        }
    }
}