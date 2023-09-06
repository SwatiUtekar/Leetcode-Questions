class Solution {
    public int firstMissingPositive(int[] nums) {
        // Arrange in thier position
        for(int i=0 ; i<nums.length ; i++) {
            int val=nums[i];
            int pos=val-1;
            if(val>0 && val<nums.length) {
                if(nums[pos]!=val) {
                    int temp=nums[i];
                    nums[i]=nums[pos];
                    nums[pos]=temp;
                    i--;
                }
            }
        }

        // find missing positive

        for(int i=0 ; i<nums.length ; i++) {
            if((i+1)!=nums[i]) {
                return i+1;
            }
        }
        return nums.length+1;
    }
}