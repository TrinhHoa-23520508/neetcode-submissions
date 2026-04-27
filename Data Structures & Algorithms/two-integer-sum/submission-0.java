class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> compensations = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            
            if(compensations.containsKey(nums[i])) 
                return new int[]{compensations.get(nums[i]), i};
            
            compensations.put(target - nums[i], i);
        }

        return new int[]{};
    }
}
