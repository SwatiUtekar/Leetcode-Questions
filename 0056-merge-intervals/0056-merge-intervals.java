class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) {
            return intervals;
        }
        
        Arrays.sort(intervals,Comparator.comparingInt(i -> i[0]));
        List<int[]> ans =  new ArrayList<>();
        int[] newintervals = intervals[0];
        ans.add(newintervals);
        
        for(int[] interval : intervals) {
            if(interval[0] <= newintervals[1]) {
                newintervals[1] = Math.max(newintervals[1] , interval[1]);
            }else {
                newintervals = interval;
                ans.add(newintervals);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}