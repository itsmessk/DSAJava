public class fib {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(palin("malayalam"));
    }
    public static void fibn(int n) {
        int a = 0; 
        int b = 1;
        for(int i = 2; i<=n; i++){
            System.out.println(a + " " + ", ");
            int c = a + b;
            a = b;
            b = c;
        }

    }
    public static boolean palin(String n){
        StringBuilder sb = new StringBuilder();
        for(int i = n.length()-1; i>=0; i--){
            sb.append(n.charAt(i));
        }
        if(sb.toString().equals(n)){
            return true;
        }
        else{
            return false;
        }
    }
}
