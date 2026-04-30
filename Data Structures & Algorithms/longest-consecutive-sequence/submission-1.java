class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        int longest = 0;
        int sequence = 1;

        for(int i = 0; i<nums.length; i++){

            if(i!=0&&nums[i]-nums[i-1] == 1) sequence++;
            else if(i!=0&&nums[i]-nums[i-1] > 1) sequence = 1;

            longest = Math.max(sequence, longest);


        }

        return longest;
        
    }
}
