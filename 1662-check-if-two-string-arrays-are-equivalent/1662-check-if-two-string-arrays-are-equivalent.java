class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1=new StringBuilder();
        for(String s1:word1) {
            sb1.append(s1);
        }
        String str1=sb1.toString();

        StringBuilder sb2=new StringBuilder();
        for(String s2:word2) {
            sb2.append(s2);
        }
        String str2=sb2.toString();

        return str1.equals(str2);
        

    }
}