public class primee {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isPrime(n));
        

    }
    public static boolean isPrime(int n){
        int cnt = 0;
        for(int i = 1; i<= Math.sqrt(n); i++){
            if(n%i == 0){
                cnt++;
            

                if(n / i != n){
                    cnt++;
                }
            }

        }

        if(n == 2){
            return true;
        }
        else{
            return false;
        }
        
    }
}
