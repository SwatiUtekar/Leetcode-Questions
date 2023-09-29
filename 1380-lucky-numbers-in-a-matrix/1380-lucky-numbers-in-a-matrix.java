class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0 ; i<matrix.length ; i++) {
            for(int j=0 ; j<matrix[0].length ; j++) {
                // row
                int min=matrix[i][j];
                int row=0;
                for(int k=0 ; k<matrix[0].length ; k++) {
                    if(min<matrix[i][(k+1)%matrix[0].length]) {
                        row++;
                    }
                }

                // column
                int max=matrix[i][j];
                int col=0;
                for(int k=0 ; k<matrix.length ; k++) {
                    if(max>matrix[(k+1)%matrix.length][j]) {
                        col++;
                    }
                }

                if(row==matrix[0].length-1 && col==matrix.length-1) {
                    list.add(matrix[i][j]);
                }
            }
        }

        return list;
    }
}