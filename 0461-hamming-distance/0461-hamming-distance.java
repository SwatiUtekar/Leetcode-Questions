class Solution {
    public int hammingDistance(int x, int y) {
        int temp=x^y;
        return count(temp);
    }
    public int count(int temp) {
        int count=0;
        while(temp!=0) {
            int lsb=temp&1;
            if(lsb==1) {
                count++;
            }
            temp=temp>>1;
        }
        return count;
    }
}