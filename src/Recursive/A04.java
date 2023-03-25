package Recursive;

public class A04 {
    public static int GCD(int m, int n) {
        if (m < n) {
            return (GCD(n, m));
        }
        if (m % n == 0) {
            return (n);
        }
        return (GCD(n, m % n));
    }
    public static void main(String[] args) {
        int m = 10, n = 15;
        System.out.println("GCD of " + m + " and " + n + " is " + GCD(m, n));
    }
}
//: Euclid’s algorithm is used to find gcd. GCD(n, m) == GCD(m, n mod m).