public class fibb {
    public static void main(String[] args) {
        int n = 5;
        int n1 = 0;
        int n2 = 1;

        System.out.println(n1 + "\n" + n2);

        for (int i = 2; i <=n; i++) {
            
            int next = n1 + n2;
            n1 = n2;
            n2 = next;
            System.out.println(n2);
        }

    }
}
