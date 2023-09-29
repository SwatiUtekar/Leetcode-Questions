class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] result=new int[rows*cols][2];
        int id=0;
        for(int i=0 ; i<rows ; i++) {
            for(int j=0 ; j<cols ; j++) {
                result[id][0]=i;
                result[id][1]=j;
                id++; 
            }            
        }

        Arrays.sort(result,(a,b)->{
            int d1=Math.abs(a[0]-rCenter)+Math.abs(a[1]-cCenter);
            int d2=Math.abs(b[0]-rCenter)+Math.abs(b[1]-cCenter);
            return d1-d2;
        });

        return result;
    }
}