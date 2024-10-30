public class RecursiveSolution {
    // (a) Recursive sum of all non-negative integers up to n
    public int sumUpToN(int n) {
        if (n == 0) {                               // base case
            return 0;
        }
        return n + sumUpToN(n - 1);              // recursive call
    }


    // (b) Recursive multiplication of all non-negative integers up to n
    public int multiplicationUpToN(int n) {
        if (n <= 1) {                               // base case (product of numbers up to 1 or 0 is 1)
            return 1;
        }
        return n * multiplicationUpToN(n - 1);   // recursive call
    }


    // (c) Recursive calculation of nth Fibonacci number
    public int fib(int n) {
        if (n == 0) {
            return 0;                               // base case 1
        } else if (n == 1) {
            return 1;                               // base case 2
        }
        return fib(n - 1) + fib(n - 2);
    }


    // (d) Recursive reverse of a string
    public String reverseString(String str) {
        if (str.isEmpty()) {
            return str;                     
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }


    // (e) Recursive check if a character exists in a string
    public boolean containChar(String s, char ch) {
        if (s.isEmpty()) {
            return false;
        }
        // Check the first character and recurse for the rest of the string
        if (s.charAt(0) == ch) {
            return true;
        }
        // Recurse for the remaining characters
        return containChar(s.substring(1), ch);
    }


    // (f) Recursive calculation of the Greatest Common Divisor (GCD) of two numbers
    public int greatestDivision(int n, int m) {
        if (m == 0) {
            return n;  // Base case
        }
        return greatestDivision(m, n % m);  // Recursive call with m and remainder of n divided by m
    }


    // (g) Recursive calculation of the number of unique paths in an n x m grid
    public int uniquePaths(int n, int m) {
        if (n == 1 || m == 1) {
            return 1;
        }
        return uniquePaths(n - 1, m) + uniquePaths(n, m - 1);
    }
}
