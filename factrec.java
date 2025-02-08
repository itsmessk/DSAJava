public class factrec {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(rec(n));
    }
    public static int rec(int n){
        if(n ==0){
            return 1;
        }
        else{
            return n * rec(n - 1);
        
        }
    }
}
