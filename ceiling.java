public class ceiling {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8 ,12, 45, 78, 98};

        System.out.println(ceiling(arr, 6666));


        
    }
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[end]){
            return -1;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}