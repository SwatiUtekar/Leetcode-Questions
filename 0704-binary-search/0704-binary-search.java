class Solution {
    public int search(int[] nums, int target) {
        int ans=binarySearch(nums,0,nums.length-1,target);
        return ans;
    }

    static int binarySearch(int[] nums,int start,int end,int target) {
        if(start>end) {
            return -1;
        }
        int mid=(end-start)/2+start;
        if(nums[mid]==target) {
            return mid;
        }
        if(nums[mid]<target) {
            return binarySearch(nums,mid+1,end,target);
        }
        return binarySearch(nums,start,mid-1,target);
    }
}