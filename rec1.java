public class rec1{
    public static void main(String[] args) {
        f1(1, "Sundar", 5);
    }

    public static void f1(int i, String n, int m){
        if(i> 5){
            return;
        }
        else{
            System.out.println(n);
            f1(i+1, n, m);
        }
    }
}