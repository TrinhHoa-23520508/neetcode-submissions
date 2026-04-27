class Solution {
    public boolean hasDuplicate(int[] nums) {

       Set<Integer> numsUnique = new HashSet<>();

       for(int num: nums){

            if(numsUnique.contains(num)) return true;
            numsUnique.add(num);
       }

       return false;
    };
}