public class palindromerec {
    public static void main(String[] args) {

        // Example string.
        String s = "madam";
        System.out.println(palindrome(0,s));
     }
     static boolean palindrome(int i, String s){
        if(i >= s.length() /2){
            return true;
        }

        else{
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;

        }
        return palindrome(i + 1, s);
     }
}
