import java.util.*;

public class hFrequencyL {
    public static void main(String args[]) {

        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        Frequency(arr, n);


    }
    

    static void Frequency(int arr[], int n){
        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int val = entry.getValue();
            int ele = entry.getKey();

            if(val > maxFreq){
                maxFreq = val;
            }
            if(val < minFreq){
                minFreq = val;
            }


        }

        System.out.println("Max Frequency: " + maxFreq);
        System.out.println("Min Frequency: " + minFreq);



    }
}
