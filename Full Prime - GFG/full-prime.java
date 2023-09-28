//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.fullPrime(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	static int fullPrime(int N){
	    //code here
	    if(N==1) {
	        return 0;
	    }
	    for(int i=2 ; i*i<=N ; i++) {
	        if(N%i==0) {
	            return 0;
	        }
	    }
	    int ans=checkPrime(N);
	    return ans;
	}
	static int checkPrime(int N) {
	   if(N==0) {
	        return 1;
	    }
	    else {
	        int rem=N%10;
	        N/=10;
	        if(rem==1 || rem==0) {
	            return 0;
	        }
	        for(int i=2 ; i*i<=rem ; i++) {
	            if(rem%i==0) {
	                return 0;
	            }
	        }
	        return checkPrime(N);
	    }
	}
}