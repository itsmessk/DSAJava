public class peakElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8 ,12, 45, 78, 98, 88, 76, 54, 32, 21, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        System.out.println(peak(arr));
    }

    public static int peak(int[] arr){
        int start = 0; 
        int end = arr.length - 1;

        while(start < end ){
            int mid = start + (end - start) / 2;

            if(arr[mid + 1] < arr[mid]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
