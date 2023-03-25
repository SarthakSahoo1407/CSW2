package Recursive;

public class A01 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
}
// Each time method fn is calling fn-1. Time Complexity is O(N)
