public class gcd {
    public static void main(String[] args) {
        gcd gcd = new gcd();
        System.out.println(gcd.gcd(15, 10));
        int lcm = gcd.lcm(15, 25);
        System.out.println(lcm);
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}


