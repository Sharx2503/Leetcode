class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] a=new int[matrix.length];
        int k=0;
        for(int i=0;i<matrix[0].length;i++){
            int c=0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==1){
                    c++;
                }
                a[k]=c;
                
            }
            k++;
        }
        return a;
    }
}