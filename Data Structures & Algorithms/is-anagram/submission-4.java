class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        int length = s.length();
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        for(int i = 0; i<length; i++){
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0)+1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0)+1);
        }

        return countS.equals(countT);

        
    }
}
