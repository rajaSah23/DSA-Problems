class Solution {
    void swap(int[][] mat , int i, int j){
        int temp=mat[i][j];
        mat[i][j]=mat[j][i];
        mat[j][i]=temp;
    }
    public void rotate(int[][] matrix) {
        //transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                swap(matrix,i,j);
            }
        }

        //horizontal flip
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]= matrix[i][matrix[i].length-1-j];
                matrix[i][matrix[i].length-1-j]=temp;
            }
        }
    }
}