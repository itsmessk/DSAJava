public class searchRowColMatrix {
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 34;
        int[] arr = searchRowColMatrix(matrix, target);
        System.out.println(java.util.Arrays.toString(arr));
    }
    public static int[] searchRowColMatrix(int[][] matrix, int target){
        int r = 0;
        int c = matrix[0].length - 1;
        
        while(r < matrix.length && c>=0){
            if(matrix[r][c] == target){
                return new int[] {r, c};
            }
            if(target < matrix[r][c]){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[] {-1, -1};
    }


}
