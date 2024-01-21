class Solution {
    public int rob(int[] nums) {
        int oddSum=0;
        int evenSum=0;
        for(int i=0 ; i<nums.length ; i++) {
            int newoddSum=evenSum+nums[i];
            int newevenSum=Math.max(oddSum,evenSum);
            oddSum=newoddSum;
            evenSum=newevenSum;
        }
        return Math.max(oddSum, evenSum);
    }
}