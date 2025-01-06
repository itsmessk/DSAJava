public class palindromicPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<= n; i++){
            int p = i, q = 1;
            for(int j = i; j<=n; j++){
                System.out.print("  ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print(p-- + " ");
            }
            for(int j = 1; j<i; j++){
                System.out.print(++q +" ");
            }

            System.out.println();

        }
    }
}
