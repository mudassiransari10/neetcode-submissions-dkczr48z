class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String s : details) {
            int ten = s.charAt(11) - '0';
            int one = s.charAt(12) - '0';
            int age = one + 10 * ten;
            if(age > 60) {
                count++;
            }
        }
        return count;
    }
}