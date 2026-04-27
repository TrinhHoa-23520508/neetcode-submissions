
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequents = new HashMap<>();

        for (int num : nums) {
            frequents.put(num, frequents.getOrDefault(num, 0) + 1);
        }

        int[] valueSet = new int[frequents.size()];
        int idx = 0;
        for (int val : frequents.values()) {
            valueSet[idx++] = val;
        }

        Arrays.sort(valueSet);

        List<Integer> result = new ArrayList<>();
        int i = valueSet.length - 1;

        while (k > 0 && i >= 0) {
            int value = valueSet[i];

            Iterator<Map.Entry<Integer, Integer>> it = frequents.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, Integer> entry = it.next();
                if (entry.getValue() == value) {
                    result.add(entry.getKey());
                    it.remove(); 
                    k--;
                    if (k == 0) break;
                }
            }

            i--;
        }

        int[] res = new int[result.size()];
        for (int j = 0; j < result.size(); j++) {
            res[j] = result.get(j);
        }

        return res;
    }
}