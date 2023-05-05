class Solution {
    public void rotate(int[][] matrix) {
        //STEP: Get the length 
        int len = matrix.length;
        
        //STEP: only need to interate for half of the matrix because we going to
        // take care of the other half when we flip them. 
        for (int i = 0; i < (len + 1) / 2; i++) {
            for (int j = 0; j < len / 2; j++) {
                int temp = matrix[len - 1 - j][i];
                
                matrix[len - 1 - j][i] = matrix[len - 1 - i][len - j - 1];
                matrix[len - 1 - i][len - j - 1] = matrix[j][len - 1 -i];
                matrix[j][len - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}
