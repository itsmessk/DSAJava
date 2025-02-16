public class DecimalToBinary {
    public static void main(String[] args) {
        int dec = 1399999;

        System.out.println("Decimal: " + dec);

        System.out.println("Binary: " + decimalToBinary(dec));

        String bin = "101010101110010111111";

        System.out.println("Binary: " + bin);

        System.out.println("Decimal: " + binaryToDecimal(bin));





    }


    public static String decimalToBinary(int dec){
        if(dec == 0){
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        int decC = dec;

        while(decC > 0){
            int rem = decC % 2;
            binary.append(rem);
            decC /= 2;
        }
        return binary.reverse().toString();
    }

    public static int binaryToDecimal(String bin){
        int dec = 0;
        int power = 1;

        for(int i = bin.length() - 1; i>=0; i--){
            if(bin.charAt(i) =='1'){
                dec += power;
                power *= 2;
            }
            else{
                power *= 2;
            }
        }
        return dec;
    }
}
