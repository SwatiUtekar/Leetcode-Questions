class Solution {
    public void moveZeroes(int[] nums) {
        int ans[] = new int[nums.length];
        int k=0;
        int count=0;
//         filling non-zero
        for(int i=0; i<nums.length ; i++) {
            if(nums[i]==0) {
                count++;
            }
            if(nums[i]!=0) {
                ans[k]=nums[i];
                k++;
            }
        }
//         filling zeros
        if(count!=0) {
            for(int j=ans.length-1 ; j>count ; j--) {
                ans[k]=0;
            }
        }
        
//         replace with ans array
        for(int i=0 ; i<nums.length ; i++) {
            nums[i]=ans[i];
        }
        
    }
}