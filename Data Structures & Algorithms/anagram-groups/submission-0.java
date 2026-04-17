class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> copySorted = new ArrayList<>();
        for(String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            copySorted.add(new String(charArray));
        }
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < copySorted.size(); i++) {
            map.computeIfAbsent(copySorted.get(i), k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
