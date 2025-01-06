public class sumofn {
    public static void main(String[] args) {
        // int n = 10;
        // int sum = 0;
        // for(int i = 1;i <=n; i++){
        //     sum += i;
        // }
        System.out.println(sumrec(10));

    }
    public static int sumrec(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n +  sumrec(n-1);
        }
    }
}
