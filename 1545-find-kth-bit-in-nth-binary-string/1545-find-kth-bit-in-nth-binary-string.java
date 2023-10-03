class Solution {
    public char findKthBit(int n, int k) {
        if(n==1){
            return '0';
        }
        int val=(int)Math.pow(2,n-1);
        if(k<val) {
            return findKthBit(n-1,k);
        }else if(k==val) {
            return '1';
        }else {
            if(findKthBit(n-1,(2*val)-k)=='1') {
                return '0';
            }else {
                return '1';
            }
        }
    }
}