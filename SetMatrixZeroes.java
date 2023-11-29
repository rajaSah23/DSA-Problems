class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] rowFlag= new boolean[matrix.length];
        boolean[] colFlag = new boolean[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rowFlag[i]=true;
                    colFlag[j]=true;
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            if(rowFlag[i]){
                 for(int j=0;j<matrix[0].length;j++){
                     matrix[i][j]=0;
                 }
            }
        }

        for(int j=0;j<matrix[0].length;j++){
            if(colFlag[j]){
                for(int i=0;i<matrix.length;i++){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
