class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] target = new int[m][n];
        int count=0;
        for(int i=0 ; i<indices.length ; i++) {
            int j=0;
            while(j<1) {
                for(int k=0 ; k<n ; k++) {
                    target[indices[i][j]][k]+=1;
                }
                for(int k=0 ; k<m ; k++) {
                    target[k][indices[i][j+1]]+=1;
                }
                j++;
            }
        }

        for(int i=0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                if(target[i][j]%2!=0) {
                    count++;
                }
            }
        }

        return count;
    }
}