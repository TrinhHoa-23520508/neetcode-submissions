class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

        int maxLength = 0;
        for(int num:nums){
            
            int temp = num;
            int length = 1;
            while(set.contains(temp-1)){
                length++;
                temp--;
            }
            maxLength = Math.max(maxLength, length);
            set.add(num);
        }

        return maxLength;
         
    }
}