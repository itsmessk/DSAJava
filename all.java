public class all {
    // Prime Number Check
public boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}

// Factorial of a Number
public long factorial(int n) {
    long result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}

// Fibonacci Series
public void fibonacciSeries(int n) {
    int a = 0, b = 1;
    System.out.print("Fibonacci Series: ");
    for (int i = 0; i < n; i++) {
        System.out.print(a + " ");
        int next = a + b;
        a = b;
        b = next;
    }
    System.out.println();
}

// Sum of Natural Numbers
public int sumOfNaturalNumbers(int n) {
    return n * (n + 1) / 2;
}

// Decimal to Binary Conversion
public String decimalToBinary(int n) {
    StringBuilder binary = new StringBuilder();
    while (n > 0) {
        binary.insert(0, n % 2);
        n /= 2;
    }
    return binary.toString();
}

// Armstrong Number
public boolean isArmstrong(int n) {
    int sum = 0, temp = n;
    int numDigits = String.valueOf(n).length();
    while (temp != 0) {
        int digit = temp % 10;
        sum += Math.pow(digit, numDigits);
        temp /= 10;
    }
    return sum == n;
}

// Sum of Digits
public int sumOfDigits(int n) {
    int sum = 0;
    while (n != 0) {
        sum += n % 10;
        n /= 10;
    }
    return sum;
}

// Find GCD (Greatest Common Divisor)
public int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

// Find LCM (Least Common Multiple)
public int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
}

// Check Perfect Number
public boolean isPerfectNumber(int n) {
    int sum = 0;
    for (int i = 1; i <= n / 2; i++) {
        if (n % i == 0) sum += i;
    }
    return sum == n;
}

// Binary to Decimal Conversion
public int binaryToDecimal(String binary) {
    int decimal = 0;
    int length = binary.length();
    for (int i = 0; i < length; i++) {
        if (binary.charAt(i) == '1') {
            decimal += Math.pow(2, length - 1 - i);
        }
    }
    return decimal;
}

// Check If a Number is a Power of 2
public boolean isPowerOfTwo(int n) {
    return n > 0 && (n & (n - 1)) == 0;
}

// Check If a Number is a Strong Number
public boolean isStrongNumber(int n) {
    int sum = 0, temp = n;
    while (temp != 0) {
        int digit = temp % 10;
        sum += factorial(digit);
        temp /= 10;
    }
    return sum == n;
}

// Find Factorial Using Recursion
public long factorialRecursion(int n) {
    if (n == 0 || n == 1) return 1;
    return n * factorialRecursion(n - 1);
}

// Find the Kth Fibonacci Number Using Formula
public int fibonacciFormula(int n) {
    double phi = (1 + Math.sqrt(5)) / 2;
    double psi = (1 - Math.sqrt(5)) / 2;
    return (int) Math.round((Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5));
}

// Sum of Nth Natural Numbers
public int sumOfNthNaturalNumbers(int n) {
    return n * (n + 1) / 2;
}

// Check Whether a Number is a Narcissistic Number
public boolean isNarcissistic(int n) {
    int sum = 0, temp = n;
    int numDigits = String.valueOf(n).length();
    while (temp != 0) {
        int digit = temp % 10;
        sum += Math.pow(digit, numDigits);
        temp /= 10;
    }
    return sum == n;
}

// Calculate Compound Interest
public double compoundInterest(double P, double r, int t, int n) {
    return P * Math.pow(1 + r / n, n * t);
}

// Quadratic Equation Solver
public void quadraticSolver(double a, double b, double c) {
    double discriminant = b * b - 4 * a * c;
    if (discriminant > 0) {
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("Roots are real and different: " + root1 + ", " + root2);
    } else if (discriminant == 0) {
        double root = -b / (2 * a);
        System.out.println("Roots are real and equal: " + root);
    } else {
        System.out.println("Roots are complex.");
    }
}

// Find the nth Prime Number
public int nthPrime(int n) {
    int count = 0, num = 2;
    while (count < n) {
        if (isPrime(num)) {
            count++;
        }
        num++;
    }
    return num - 1;
}

// Find the Sum of First N Prime Numbers
public int sumOfFirstNPrimes(int n) {
    int sum = 0, count = 0, num = 2;
    while (count < n) {
        if (isPrime(num)) {
            sum += num;
            count++;
        }
        num++;
    }
    return sum;
}

// Sum of First N Odd or Even Numbers
public int sumOfOddOrEven(int n, boolean isOdd) {
    if (isOdd) {
        return n * n; // Sum of first N odd numbers
    } else {
        return n * (n + 1); // Sum of first N even numbers
    }
}

// HCF Using Euclidean Algorithm
public int hcf(int a, int b) {
    return gcd(a, b);
}

// Find the Power of a Number (x^n)
public double powerOfNumber(double x, int n) {
    return Math.pow(x, n);
}

// Check Whether a Number is a Strong Prime
public boolean isStrongPrime(int n) {
    if (isPrime(n)) {
        int prev = n - 1;
        while (!isPrime(prev)) prev--;
        int next = n + 1;
        while (!isPrime(next)) next++;
        return n > (prev + next) / 2;
    }
    return false;
}

// Find the Sum of Squares of First N Natural Numbers
public int sumOfSquares(int n) {
    return (n * (n + 1) * (2 * n + 1)) / 6;
}

// Find the Sum of Cubes of First N Natural Numbers
public int sumOfCubes(int n) {
    return (int) Math.pow(n * (n + 1) / 2, 2);
}

// Find the Nth Harmonic Number
public double nthHarmonic(int n) {
    double sum = 0.0;
    for (int i = 1; i <= n; i++) {
        sum += 1.0 / i;
    }
    return sum;
}

// Find the Sum of the Digits of a Number Raised to the Power of N
public int sumOfDigitsPowerN(int n, int power) {
    int sum = 0;
    while (n != 0) {
        int digit = n % 10;
        sum += Math.pow(digit, power);
        n /= 10;
    }
    return sum;
}

// Count the Number of Set Bits in a Binary Number (Hamming Weight)
public int countSetBits(int n) {
    return Integer.bitCount(n);
}

// Calculate Distance Between Two Points in a 2D Plane
public double distanceBetweenPoints(int x1, int y1, int x2, int y2) {
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
}

// Find the Roots of a Cubic Equation
public void cubicEquationSolver(double a, double b, double c, double d) {
    // This is a simplified method to find roots
    // You can implement Cardano's method for exact real solutions
}

// Find the Sum of Geometric Series
public double sumOfGeometricSeries(double a, double r, int n) {
    return a * (1 - Math.pow(r, n)) / (1 - r);
}

// Generate a Pascal’s Triangle
public static void pascalTriangle(int rows) {
    for (int i = 0; i < rows; i++) {
        int value = 1;
        for(int k = 0; k < rows - i; k++) {
            System.out.print(" ");
        }
        for (int j = 0; j <= i; j++) {
            System.out.print(value + " ");
            value = value * (i - j) / (j + 1);
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    pascalTriangle(5);
}
}
