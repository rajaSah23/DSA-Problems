class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] rowArr = new boolean[matrix.length];
        boolean[] colArr = new boolean[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rowArr[i]=true;
                    colArr[j]=true;
                }
            }
        }

        for(int i=0;i<rowArr.length;i++){
            if(rowArr[i]){
                for(int j=0;j<matrix[0].length;j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j=0;j<colArr.length;j++){
            if(colArr[j]){
                for(int i=0;i<matrix.length;i++){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}