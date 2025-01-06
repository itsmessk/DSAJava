public class Amstrong {
    public static void main(String[] args) {
        for(int i = 100; i<=999; i++){
            if(isAmstrong(i)){
                System.out.println(i);
            }
        }

    }

    public static boolean isAmstrong(int n){
        int val = n;
        int num = 0;
        
        
        while(val>0){
            int rem = val % 10;
            num += Math.pow(rem, 3);
            val /= 10;
        }
        return num == n;
    }
}
