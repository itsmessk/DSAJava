class Solutionn {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        arr = productExceptSelf(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        int prod = 1;
        int i = 0;

        while(i < n){
            int j = 0;
            if(i != j){
                prod *= nums[j];
            }
            j++;
            
            if(j == n){
                arr[i] = prod;
                prod = 1;
                i++;
            }
            
        }

        return arr;
    }
}