class Solution {
    public int fib(int n) {
        int ans=fibVal(n);
        return ans;
    }
    static int fibVal(int n) {
        if(n==1) {
            return 1;
        }
        if(n==0) {
            return 0;
        }
        n=fibVal(n-1)+fibVal(n-2); 
        return n;
    }
}