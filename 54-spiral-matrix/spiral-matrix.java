class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans= new ArrayList<>();
        int startRow = 0,endRow = matrix.length-1;
        int startCol = 0,endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //1.start row
            for(int j=startCol;j<=endCol;j++){
                ans.add(matrix[startRow][j]);
            }
            //2.last col
            for(int i=startRow+1;i<=endRow;i++){
                ans.add(matrix[i][endCol]);
            }
            //3.last row
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow) break;
                ans.add(matrix[endRow][j]);
            }

            //4.start col
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol) break;
                ans.add(matrix[i][startCol]);
            }

            startRow++;
            endRow--;

            startCol++;
            endCol--;
            
        }

        return ans;
    }
}