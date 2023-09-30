class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public void findCombination(int idx,int[] arr,int target,List<List<Integer>> ans,List<Integer> ls) {
        if(idx==arr.length) {
            if(target==0) {
                ans.add(new ArrayList<>(ls));
            }
            return;
        }
        if(arr[idx]<=target) {
            ls.add(arr[idx]);
            findCombination(idx,arr,target-arr[idx],ans,ls);
            ls.remove(ls.size()-1);
        }
        findCombination(idx+1,arr,target,ans,ls);
    }
}