class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans=new HashMap<>();

        for(String s:strs) {
            char []charArr= s.toCharArray();
            Arrays.sort(charArr);
            String sortedStr=new String(charArr);

            if(!ans.containsKey(sortedStr)) {
                ans.put(sortedStr,new LinkedList<String>());
            }
            ans.get(sortedStr).add(s);
        }

        return new LinkedList<>(ans.values());
    }
}