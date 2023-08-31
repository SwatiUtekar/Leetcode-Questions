class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        Set<List<Integer>> ans= new HashSet<>();

        for(int i=0 ; i<nums.length-3 ; i++) {
            for(int j=i+1 ; j<nums.length-2 ; j++) {
                int idx1=j+1;
                int idx2=nums.length-1;

                while(idx1<idx2) {
                    long sum=(long)(nums[i])+(long)(nums[j])+(long)(nums[idx1])+(long)nums[idx2];
                    if(sum==target) {
                        List<Integer> middleAns=new ArrayList<>();
                        middleAns.add(nums[i]);
                        middleAns.add(nums[j]);
                        middleAns.add(nums[idx1]);
                        middleAns.add(nums[idx2]);

                        Collections.sort(middleAns);
                        ans.add(middleAns);

                        idx1++;
                    }else if(sum<target) {
                        idx1++;
                    }else {
                        idx2--;
                    }
                    
                }
            }
        }

        return new ArrayList<>(ans);
    }
}