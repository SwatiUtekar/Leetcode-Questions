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
            System.out.println(ob.digitPrime(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	int digitPrime(int N){
		    //code here
		    int val=calSum(N);
		    if(val==1) {
		        return 0;
		    }
		  for(int i=2 ; i*i<=val ; i++) {
		      if(val%i==0) {
		          return 0;
		      }
		  }
		  return 1;
	}
	int calSum(int N) {
	    int sum=0;
	    while(N>0) {
	        int rem=N%10;
	        N/=10;
	        sum+=rem;
	    }
	    N=sum;
	    if(N>0 && N<10) {
	        return N;
	    }else {
	        return calSum(N);
	    }
	}	
}