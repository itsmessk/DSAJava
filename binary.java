import java.util.Scanner;

public class binary{
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,77,5,4,3,2};
        
        java.util.Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int start = 0;
        int end = arr.length - 1;

        // boolean sOA = arr[start] < arr[end];


        // while(start <= end){
        //     int mid = start + (end - start) / 2;

        //     if(arr[mid] == target){
        //         System.out.println(mid);
        //         return;
        //     }

        //     if(sOA){
        //         if(target < arr[mid]){
        //             end = mid -1;
        //         }
        //         else {
        //             start = mid + 1;
        //         }
        //     }
        //     else{
        //         if(target > arr[mid]){
        //             end = mid -1;
        //         }
        //         else {
        //             start = mid + 1;
        //         }
        //     }
        // }



        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                System.out.println(mid);
                return;
            }
        }
        System.out.println(-1);
        return;
        
    }
}