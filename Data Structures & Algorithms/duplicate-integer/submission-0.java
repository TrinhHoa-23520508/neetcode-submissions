class Solution {
    public boolean hasDuplicate(int[] nums) {

       HashSet<Integer> numUnique = new HashSet<>();

       for(int num: nums){
        if(numUnique.contains(num)) return true;
            numUnique.add(num);
       }

       return false; 
    };
}