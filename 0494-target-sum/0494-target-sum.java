class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int ans=findCount(nums,0,0,target);
        return ans;
    }
    public int findCount(int[] arr,int idx,int curr_sum,int target) {
        if(idx==arr.length) {
            if(curr_sum==target) {
                return 1;
            }else {
                return 0;
            }
        }
        int left=findCount(arr,idx+1,curr_sum+arr[idx],target);
        int right=findCount(arr,idx+1,curr_sum-arr[idx],target);
        return left+right;
    }
}
