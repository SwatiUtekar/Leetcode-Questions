class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        for(int i=0 ; i<nums.length ; i++) {
            if(i==0) {
                rightSum=rightSumCal1(1,nums);
            }else if(i==nums.length-1) {
                leftSum=leftSumCal1(0,nums);
                rightSum=0;
            }else {
                rightSum=rightSumCal2(i,nums);
                leftSum=leftSumCal2(0,i,nums);
            }
            
            if(leftSum==rightSum) {
                return i;
            }
        }
        return -1;
    }
    public int rightSumCal1(int idx , int[] arr) {
        int rightSum=0;
        for(int j=idx ; j<arr.length ; j++) {
            rightSum+=arr[j];
        }
        return rightSum;
    }
    public int leftSumCal1(int idx , int[] arr) {
        int leftSum=0;
        for(int j=idx ; j<arr.length-1 ; j++) {
            leftSum+=arr[j];
        }
        return leftSum;
    }
    public int leftSumCal2(int idx , int i, int[] arr) {
        int leftSum=0;
        for(int j=idx ; j<i ; j++) {
            leftSum+=arr[j];
        }
        return leftSum;
    }
    public int rightSumCal2(int idx , int[] arr) {
        int rightSum=0;
        for(int j=idx+1 ; j<arr.length ; j++) {
            rightSum+=arr[j];
        }
        return rightSum;
    }
    
}