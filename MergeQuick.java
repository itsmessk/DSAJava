import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeQuick {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeSort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        List<Integer> arr1 = new ArrayList<>();
        arr1.add(9);
        arr1.add(4);
        arr1.add(7);
        arr1.add(6);
        arr1.add(3);
        arr1.add(1);
        arr1.add(5);
        System.out.println("Before sorting list: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1.get(i) + " ");
        }
        System.out.println();
        qs(arr1, 0, n - 1);
        System.out.println("After sorting list: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1.get(i) + " ");
        }
        System.out.println();
    }


    static void merge(int[] arr, int low, int mid, int high){

        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i = low; i<=high; i++){
            arr[i] = temp.get(i - low);
        }
    }


    static void mergeSort(int[] arr, int low, int high){
        if(low >= high) return;
        int mid = (low + high ) /2;

        mergeSort(arr , low , mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }


    static void qs(List<Integer> arr, int low, int high){
        if(low >= high){ return; }
        else{
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }

    static int partition(List<Integer> arr, int low, int high){
        int pivot = arr.get(low);
        int i = low; 
        int j = high;

        while(i < j){
            while(arr.get(low) <= pivot && i <= high - 1){
                i++;
            }
            while(arr.get(high) >= pivot && j >= low+1){
                j--;
            }
            if(i < j){
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }
}
