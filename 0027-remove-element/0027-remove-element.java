class Solution {
    public int removeElement(int[] nums, int val) {
        int ans=0;
        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i]==val) {
                ans++;
                nums[i]=51;
            }
        }
        Arrays.sort(nums);
        return nums.length-ans;
    }
}