public class febrec {
    public static void main(String[] args) {

        // Here, let’s take the value of N to be 4.
        int N = 10;

        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
          }
     }

     static int fib(int n){
        if(n <= 1){
            return n;
        }
        if( n == 2){
            return 1;
        }
        else{
            return fib(n- 1) + fib(n-2);
        }
     }
}
