// // class Solution {
// //     public String restoreString(String s, int[] indices) {
// //         char arr[] = new char[s.length()];
// //         for(int i =  0; i< s.length(); i++){
// //             arr[indices[i]] = s.charAt(i);

// //         }
// //         return new String(arr);
// //     }

// //     public static void main(String[] args) {
// //         Solution solution = new Solution();
        
// //         // Input
// //         String s = "codeleet";
// //         int[] indices = {4,5,6,7,0,2,1,3};

// //         // Output
// //         String result = solution.restoreString(s, indices);
// //         System.out.println(result);  // Output: "leetcode"
// //     }
// // }


// class Solution {
//     public int reverse(int n) {
//         int last = 0;
//         int reve = 0;
//         boolean flag = false;
//         if(n < 0){
//             n = Math.abs(n);
//             flag = true;
//         }
//         while(n> 0){
//             last = n % 10;
//             if(reve  > Integer.MAX_VALUE / 10 || reve  < Integer.MIN_VALUE / 10 ){
//                 return 0;
//             }
//             reve = reve * 10 + last;
//             n /= 10;
//         }
        
        

//         if(flag){
//             return -reve;
//         }
//         else{
//             return reve;
//         }
        
//     }
//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         System.out.println(solution.reverse(153423646)); // Output: 321
//     }
    
// }

// class Solution {
//     public int smallestNumber(int n) {
//         int binary = decToBin(n);
//         String str = String.valueOf(binary);
//         StringBuilder sb = new StringBuilder(str);
//         int len = str.length();
//         for(int i = 0; i< len; i++){
//             if(sb.charAt(i) == '0'){
//                 sb.setCharAt(i, '1');
//             }
//         }
//         binary = Integer.parseInt(sb.toString());
//         int deci = binToDeci(binary);
//         return deci;
        
       
    
        

//     }
    
//     public int decToBin(int n){
//         int bin = 0;
//         int rem = 0;

//         while(n >0){
//             rem = n % 2;
//             bin = bin * 10 + rem;
//             n /= 2;
//         }
//         return bin;
//     }

//     public int binToDeci(int n){
//         int deci = 0;
//         int rem = 0;

//         while(n >0){
//             rem = n % 10;
//             deci = deci * 2 + rem;
//             n /= 10;
//         }
//         return deci;
//     }
//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         System.out.println(solution.smallestNumber(10)); // Output: 101
//     }

// }



class Solution {
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {  // Fix: Check if `i` is prime, not `n`
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) { // Optimized the loop to check until sqrt(n)
            if (n % i == 0) {
                return false;  // If divisible, return false (not prime)
            }
        }
        return true; // If no divisors found, it is prime
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 10;  // You can change the value of n for testing
        System.out.println("Number of primes less than " + n + " is: " + solution.countPrimes(n));
    }
}
