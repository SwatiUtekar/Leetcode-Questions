class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer,Integer> ans=new HashMap<>();
        // count occurances
        for(int i=0 ; i<nums.length ; i++) {
            if(ans.containsKey(nums[i])) {
                ans.put(nums[i],ans.get(nums[i])+1);
            }else {
                ans.put(nums[i],1);
            }
        }

        // Majority element

        for(Map.Entry<Integer,Integer> i: ans.entrySet()) {
            if(i.getValue()>n) {
                return i.getKey();
            }
        }
        return -1;
    }
}