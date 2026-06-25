class Solution {
    public boolean isPalindrome(String s) {
        String processedS = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        for(int i = 0, j = processedS.length() - 1; i < processedS.length() / 2; i++) {
            if(processedS.charAt(i) != processedS.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
}
