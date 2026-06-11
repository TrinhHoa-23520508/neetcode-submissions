class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for(int i = 0; i<strs.length; i++){

            String key = createKey(strs[i]);
            if(!result.containsKey(key)){
                List<String> group = new ArrayList<>();
                result.put(key, group);
            }

            result.get(key).add(strs[i]);
        }

        return new ArrayList<>(result.values());
    }


    public String createKey(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
