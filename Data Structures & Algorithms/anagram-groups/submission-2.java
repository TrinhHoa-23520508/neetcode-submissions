class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i<strs.length; i++){
            String key = createKey(strs[i]);

            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key, list);
            }
        }

       

        return new ArrayList<>(map.values());
        
    }

    public String createKey(String s){

        char[] array = s.toCharArray();
        Arrays.sort(array);

        return new String(array);
    }
}
