class Solution {
    public int minFallingPathSum(int[][] matrix) {
        if(matrix == null || matrix.length==0) {
            return 0;
        }
        if(matrix.length>1) {
            for(int i=matrix.length-2 ; i>=0 ; i--) {
                for(int j=0 ; j<matrix[i].length ; j++) {
                    if(i+1<matrix.length) {
                        int min=matrix[i+1][j];
                        if(j>0) {
                            min=Math.min(min,matrix[i+1][j-1]);
                        }
                        if(j<matrix[i].length-1) {
                            min=Math.min(min,matrix[i+1][j+1]);
                        }
                        matrix[i][j]+=min;
                    }
                }
            }
        }
        int result=matrix[0][0];
        for(int i=0 ; i<matrix[0].length ; i++) {
            result=Math.min(result,matrix[0][i]);
        }
        return result;
    }
}