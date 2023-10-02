class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr1=s.split(" ");
        
        return arr1[arr1.length-1].length();
        
    }
}