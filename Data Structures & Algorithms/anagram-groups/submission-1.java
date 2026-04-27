class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){

            char[] array = s.toCharArray();
            Arrays.sort(array);

            String key = new String(array);
            if(map.containsKey(key)) map.get(key).add(s);
            else{
                List groupAnagrams = new ArrayList<>();
                groupAnagrams.add(s);
                map.put(key, groupAnagrams); 
            }
        }

        return new ArrayList<>(map.values());
        
    }
}
