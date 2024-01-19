class Solution {
    public char findTheDifference(String s, String t) {
        char smallArray[] = s.toCharArray();
        Arrays.sort(smallArray);
        char largeArray[] = t.toCharArray();
        Arrays.sort(largeArray);
        for(int i=0 ; i<smallArray.length ; i++) {
            if(smallArray[i]!=largeArray[i]) {
                return largeArray[i];
            }
        }
        return largeArray[largeArray.length-1]; 
    }
}