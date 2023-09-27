//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = new String[2];
            S = read.readLine().split(" "); 
            long a = Integer.parseInt(S[0]);
            long b = Integer.parseInt(S[1]);
            Solution ob = new Solution();

            System.out.println(ob.countDigits(a, b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
   static long countDigits(long a, long b){
        // code here
        long count=0;
        long product=a*b;
        long ans=calDigit(product,count);
        return ans;
    }
    static long calDigit(long product,long count) {
        if(product==0) {
            return count;
        }
        else {
            product/=10;
            count++;
        }
        return calDigit(product,count);
    }
}