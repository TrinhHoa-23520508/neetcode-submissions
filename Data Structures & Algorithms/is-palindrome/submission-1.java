class Solution {
    public boolean isPalindrome(String s) {
        
        char[] arrayChar = s.toCharArray();
        
        int left = 0;
        int right = s.length() - 1;

        while(left<right){
            if(!Character.isLetterOrDigit(arrayChar[left])){
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(arrayChar[right])){
                right--;
                continue;
            }

            if(Character.toLowerCase(arrayChar[left])!=Character.toLowerCase(arrayChar[right])) return false;

            left++;
            right--;
        }

        return true;
    }
}
