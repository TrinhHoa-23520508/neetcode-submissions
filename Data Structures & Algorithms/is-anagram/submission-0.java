

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        HashMap<Character, Integer> freCharacter = new HashMap<>();
        char[] charOfS = s.toCharArray();
        char[] charOfT = t.toCharArray();
 
        for(char c:charOfS){
            if(freCharacter.containsKey(c)) freCharacter.put(c, freCharacter.get(c)+1);
            else freCharacter.put(c,1);

        }

        for(char c:charOfT){
            if(!freCharacter.containsKey(c)) return false;
            freCharacter.put(c, freCharacter.get(c)-1);
            if(freCharacter.get(c)==0) freCharacter.remove(c);

        }

        if(!freCharacter.isEmpty()) return false;
        return true;
    }
}