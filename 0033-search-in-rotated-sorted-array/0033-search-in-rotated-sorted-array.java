class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<=end) {
            mid=start+(end-start)/2;
            // Right side is sorted
            if(nums[mid]<=nums[end]) {
                if(nums[mid]<=target && target<=nums[end]) {
                    if(nums[mid]==target) {
                        return mid;
                    }else {
                        start=mid+1;
                    }     
                }else {
                    end=mid-1;
                }
                
            }//Left side is sorted
            else if(nums[mid]>=nums[start]) {
                if(nums[start]<=target && target<=nums[mid]) {
                    if(nums[mid]==target) {
                        return mid;
                    }else {
                        end=mid-1;
                    }    
                }else {
                    start=mid+1;
                }
            }
        }
        if(nums[mid]==target) {
            return mid;
        }
        return -1;
    }
}