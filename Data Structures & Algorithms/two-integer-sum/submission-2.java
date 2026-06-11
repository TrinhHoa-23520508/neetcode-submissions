class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> compensation = new HashMap<>();

        for(int i = 0; i<nums.length; i++){

            Integer num = nums[i];
            if(compensation.containsKey(num)) return new int[]{compensation.get(num), i};
            else compensation.put(target-num, i);

        }

        return new int[]{0,0};
    }
}
