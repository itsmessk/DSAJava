import java.util.Scanner;

public class bintodeci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int mynum = num;
        int deci = 0;
        int last = 0;

        while(num > 0){
            last = num % 10;
            deci = deci * 2 + last;
            num = num / 10;
        }
    }
    

}
