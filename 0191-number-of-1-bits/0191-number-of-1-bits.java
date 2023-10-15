public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        for(int i=0 ; i<32 ; i++) {
            int lsb=n&1;
            if(lsb==1) {
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}