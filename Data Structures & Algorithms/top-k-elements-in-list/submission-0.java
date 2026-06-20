class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        List<List<Integer>> freq = new ArrayList<>();
        for(int i = 0; i <= nums.length; i++) {
            freq.add(new ArrayList<>());
        }
        
        for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();

            freq.get(frequency).add(num);
        } 
        
        List<Integer> res = new ArrayList<>();
        for(int i = freq.size() - 1; i >0; i--) {
            for(int n : freq.get(i)) {
                res.add(n);
                if(res.size() >= k) {
                    return res.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
                }
            }   
        }
        return new int[0];
    }
}
