public class Main {
    public static void main(String[] args) {
        IterativeSolution iterativeSolution = new IterativeSolution();
        RecursiveSolution recursiveSolution = new RecursiveSolution();

        // (a) Testing sumUpToN
        System.out.println("Sum up to N (Iterative): " + iterativeSolution.sumUpToN(5)); // Expected: 15
        System.out.println("Sum up to N (Recursive): " + recursiveSolution.sumUpToN(5)); // Expected: 15

        // (b) Testing multiplicationUpToN (factorial)
        System.out.println("Multiplication up to N (Iterative): " + iterativeSolution.multiplicationUpToN(5)); // Expected: 120
        System.out.println("Multiplication up to N (Recursive): " + recursiveSolution.multiplicationUpToN(5)); // Expected: 120

        // (c) Testing Fibonacci
        System.out.println("Fibonacci N (Iterative): " + iterativeSolution.fib(6)); // Expected: 8
        System.out.println("Fibonacci N (Recursive): " + recursiveSolution.fib(6)); // Expected: 8

        // (d) Testing reverseString
        System.out.println("Reversed string (Iterative): " + iterativeSolution.reverseString("hello")); // Expected: "olleh"
        System.out.println("Reversed string (Recursive): " + recursiveSolution.reverseString("hello")); // Expected: "olleh"

        // (e) Testing containChar
        System.out.println("Contain character 'e' (Iterative): " + iterativeSolution.containChar("hello", 'e')); // Expected: true
        System.out.println("Contain character 'e' (Recursive): " + recursiveSolution.containChar("hello", 'e')); // Expected: true
        System.out.println("Contain character 'z' (Iterative): " + iterativeSolution.containChar("hello", 'z')); // Expected: false
        System.out.println("Contain character 'z' (Recursive): " + recursiveSolution.containChar("hello", 'z')); // Expected: false

        // (f) Testing greatestDivision (GCD)
        System.out.println("GCD of 48 and 18 (Iterative): " + iterativeSolution.greatestDivision(48, 18)); // Expected: 6
        System.out.println("GCD of 48 and 18 (Recursive): " + recursiveSolution.greatestDivision(48, 18)); // Expected: 6

        // (g) Testing uniquePaths
        System.out.println("Unique paths in 3x3 grid (Iterative): " + iterativeSolution.uniquePaths(3, 3)); // Expected: 6
        System.out.println("Unique paths in 3x3 grid (Recursive): " + recursiveSolution.uniquePaths(3, 3)); // Expected: 6
    }
}
