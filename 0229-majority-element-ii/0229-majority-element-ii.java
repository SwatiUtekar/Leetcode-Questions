class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0 ; i<nums.length ; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        List<Integer> ans=new ArrayList<>();
        int count=nums.length/3;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int element=entry.getKey();
            int occurance=entry.getValue();
            if(occurance>count) {
                ans.add(element);
            }
        }
        return ans;
    }
}