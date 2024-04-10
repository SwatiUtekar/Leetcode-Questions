class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int val=0;
        int idx=0;
        int count=0;
        for(int i=0 ; i<nums1.length ; i++) {
            count=0;
            for(int j=0 ; j<nums2.length ; j++) {
                if(nums1[i]==nums2[j]) {
                    val=nums2[j];
                    idx=j;
                    break;
                }
            }
            while(idx<nums2.length) {
                if(val<nums2[idx]) {
                    ans[i]=nums2[idx];
                    count=1;
                    break;
                }
                idx++;
            }
            if(count==0) {
                ans[i]=-1;
            }
        }
        return ans;
    }
}