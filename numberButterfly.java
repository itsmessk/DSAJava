public class numberButterfly {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Number Butterfly");
        for(int i = 1; i<=n; i++){
            int p = 1;
            for(int j = 1; j<i; j++){
                System.out.print(p++ + " ");
            }
            for(int k = i; k<=n; k++){
                System.out.print("  ");
            }
            for(int j = i; j <=n; j++){
                System.out.print("  ");
            }
            for(int k = 1; k<i; k++){
                System.out.print(--p + " ");
            }
            System.out.println();

        }
        for(int i = 1; i<=n; i++){
            int p = 1;
            for(int j = i; j<=n; j++){
                System.out.print(p++ + " ");
            }
            for(int k = 1; k<i; k++){
                p++;
                System.out.print("  ");
            }
            
            for(int j = 1; j <i; j++){
                p++;
                System.out.print("  ");
            }
            
            for(int k = i; k<=n; k++){
                System.out.print(--p + " ");
            }
            System.out.println();

        }

    }
}
