class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        //transpose the matrix
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //then reverse the matrix
        for(int i=0;i<len;i++){
            int start = 0;
            int end = len-1;
            while(start<end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
        
    }
}