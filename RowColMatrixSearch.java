public class RowColMatrixSearch {
    public static void main(String[] args) {
        
    }

    public static int[] bs(int[][] arr, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(target == arr[row][mid]){
                return new int[] {row, mid};
            }
            else if(target < arr[row][mid]){
                cEnd = mid - 1;
            }
            else{
                cStart = mid + 1;
            }
        }
        return new int[] {-1, -1};
    }
    public static int[] searchMatrix(int[][] matrix, int target) {
}
