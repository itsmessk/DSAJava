import java.util.Arrays;

public class swapArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
        System.out.println(maxi(arr));

    }
    public static void swap(int[] arr, int n, int m){
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
        System.out.println(Arrays.toString(arr));

    }
    public static int maxi(int[] arrq){
        int maxm = arrq[0];
        for(int a: arrq){
            if(a > maxm){
                maxm = a;
            }
        }
        return maxm;
    }
}
