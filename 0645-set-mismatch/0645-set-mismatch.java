class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
        // sort
        int i=0;
        while(i<nums.length) {
            int element=nums[i]-1;
            if(nums[i]!=nums[element]) {
                int temp=nums[i];
                nums[i]=nums[element];
                nums[element]=temp;
            }
            else {
                i++;
            }
        }
        
        // finding twice and missing number
        for(int j=0 ; j<nums.length ; j++) {
            if(nums[j]!=j+1) {
                ans[0]=nums[j];
                ans[1]=j+1;
            }
        }

        return ans;

    }
}