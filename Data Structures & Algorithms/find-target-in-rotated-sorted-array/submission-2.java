class Solution {
    public int search(int[] nums, int target) {
        
        int n, l, r, mid, pivot;
        n = nums.length;
        l = 0;
        r = n-1;
        while(l<r){

            mid = l + (r - l)/2;
            if(nums[mid]>nums[r]){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }

        pivot = l;
        if(pivot == 0) return binarySearch(nums, 0, n-1, target);
        else{
            if(nums[n-1]<target) return binarySearch(nums, 0, pivot, target);
            else return binarySearch(nums, pivot, n-1, target);
        }
    }

    public int binarySearch(int[] nums, int l, int r, int target){

        while(l<=r){

            int mid = l + (r-l)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) l = mid + 1;
            else r = mid - 1;
        }

        return -1;
    }
}
