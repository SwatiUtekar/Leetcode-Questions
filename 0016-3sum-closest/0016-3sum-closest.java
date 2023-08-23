class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int ClosestSum=nums[0]+nums[1]+nums[2];

        for(int i=0 ; i<nums.length-2 ; i++) {
            int idx1=i+1;
            int idx2=nums.length-1;

            while(idx1<idx2) {
                int sum=nums[i]+nums[idx1]+nums[idx2];
                if(Math.abs(sum-target)<Math.abs(ClosestSum-target)) {
                    ClosestSum=sum;
                }
                if(sum<target) {
                    idx1++;
                }else {
                    idx2--;
                }
            }
        }
        return ClosestSum;
    }
}