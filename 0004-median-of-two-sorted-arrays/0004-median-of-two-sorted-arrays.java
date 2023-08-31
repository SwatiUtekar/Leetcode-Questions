class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergeArray = new int[nums1.length+nums2.length];
        // 1st array
        for(int i=0 ; i<nums1.length ; i++) {
            mergeArray[i]=nums1[i];
        }
        // 2nd array
        for(int i=0 ;i<nums2.length ; i++) {
            mergeArray[i+nums1.length]=nums2[i];
        }

        Arrays.sort(mergeArray);
        if(mergeArray.length%2!=0) {
            return mergeArray[mergeArray.length/2];
        }else {
            int mid=mergeArray.length/2;
            return (float)(mergeArray[mid-1]+mergeArray[mid])/2;
        }
    }
}