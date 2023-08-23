class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> result=new HashSet<>();
        for(int i=0 ; i<nums.length-2 ; i++) {
            int idx1=i+1;
            int idx2=nums.length-1;

            while(idx1<idx2) {
                int sum=nums[i]+nums[idx1]+nums[idx2];
                if(sum==0) {
                    List<Integer> middleList=new ArrayList<Integer>();
                    middleList.add(nums[i]);
                    middleList.add(nums[idx1]);
                    middleList.add(nums[idx2]);

                    result.add(middleList);
                    idx1++;
                }else if(sum>0) {
                    idx2--;
                }else {
                    idx1++;
                }
            }
        }

        return new ArrayList<>(result);
    }
}