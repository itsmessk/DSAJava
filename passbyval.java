public class passbyval {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Before: " + x);
        change(x);
        System.out.println("After: " + x);
    }
    
    public static void change(int x) {
        x++;
    }
    
}
