class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        arr[0]=0;
        for(int i=1 ; i<=n ; i++) {
            arr[i]=bits(i);
        }
        return arr;
    }
    public int bits(int i) {
        int count=0;
        while(i!=0) {
            int lsb=i&1;
            if(lsb==1) {
                count++;
            }
            i=i>>1;
        }
        return count;
    }
}