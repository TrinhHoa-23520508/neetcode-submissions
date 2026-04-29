class Solution {

    public boolean isPalindrome(String s) {
       
       StringBuilder filter = new StringBuilder();
       
       for(char c:s.toCharArray()){

            if(Character.isLetterOrDigit(c)) filter.append(Character.toLowerCase(c));

       }

       String original = filter.toString();
       String revered = filter.reverse().toString();

       return original.equals(revered);


    }
}
