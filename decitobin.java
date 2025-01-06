
import java.util.Scanner;

public class decitobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int mynum = num;
        int bin = 0;
        int rem = 0;

        while(mynum > 0){
            rem = mynum % 2;
            bin = bin * 10 + rem;
            mynum = mynum / 2;
        }
        System.out.println(bin);
    }
}
