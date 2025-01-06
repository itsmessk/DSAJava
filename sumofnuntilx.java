import java.util.Scanner;

public class sumofnuntilx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        int sum = 0;
        while(true){
            n = sc.nextLine();
            if(n .equals("x") || n.equals('X')){
                
                System.out.println(sum);
                break;
            }
            else{
                int m = Integer.parseInt(n);
                sum += m;
            }
        }
        
    }
}
