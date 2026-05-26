class Solution {
    public int[] productExceptSelf(int[] nums) {

        int length = nums.length;
        int[] pre = new int[length];
        int[] suf = new int[length];
        int[] res = new int[length];

        pre[0] = 1;
        suf[length-1] = 1;

        for(int i = 1; i<length; i++){
            pre[i] = nums[i-1]*pre[i-1];
        }

        for(int i = length-2; i>=0; i--){
            suf[i] = nums[i+1]*suf[i+1];
        }

        for(int i = 0; i<length; i++){
            res[i] = pre[i] * suf[i];
        }

        return res;

        
    }
}  
