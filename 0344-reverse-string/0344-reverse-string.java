class Solution {
    public void reverseString(char[] s) {
        stringManipulation(s,0,s.length-1);
    }
    
    static void stringManipulation(char[] s,int start,int end) {
        if(start<end) {
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            stringManipulation(s,start+1,end-1);
        }
    }
}