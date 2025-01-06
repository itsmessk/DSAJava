public class shufflearray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,6};
        int[] arr = new int[array.length];
        int n = array.length/2;
        for(int i = 0; i< n; i++){
            arr[i*2] = array[i];
            arr[i*2 + 1] = array[i+n];
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}
