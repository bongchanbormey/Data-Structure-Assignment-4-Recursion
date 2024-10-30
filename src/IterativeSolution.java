public class IterativeSolution {
    // (a) Iterative sum of all non-negative integers up to n
    public int sumUpToN(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }


    // (b) Iterative multiplication of all non-negative integers up to n
    public int multiplicationUpToN(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }


    // (c) Iterative of nth Fibonacci number
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int fib = 1;
        int prevFib = 0;

        for (int i = 2; i <= n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }


    // (d) Iterative reversed a string
    public String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }


    // (e) Iterative checking if a char exists in a string
    public boolean containChar(String s, char ch){
        for(char c: s.toCharArray()){
            if (c == ch){
                return true;
            }
        }
        return false;
    }


    // (f) Iterative of the Greatest Common Divisor (GCD) of two numbers
    public int greatestDivision(int n, int m) {
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }


    // (g) Iterative of the number of unique paths in a n x m grid
    public int uniquePaths(int n, int m) {
        // Initialize a 2D array to store the number of paths to each cell
        int[][] dp = new int[n][m];

        // There is only 1 way to reach the cells in the first row and first column
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < m; j++) {
            dp[0][j] = 1;
        }

        // Calculate the number of paths to each cell
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // Return the number of paths to the bottom right corner
        return dp[n - 1][m - 1];
    }

}