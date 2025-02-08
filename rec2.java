public class rec2 {
    public static void main(String[] args) {
        System.out.println(f2(10)); 
    }

    public static int f2(int i){
        if(i == 0){
            return 0;
        }
        else{
            
            return i + f2(i-1);
        }
    }
}
