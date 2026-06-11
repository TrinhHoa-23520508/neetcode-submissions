class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int missing = 0;
        for(int num:nums){
            if(num==missing) missing++;
            else break;

        }

        return missing;
    }
}
