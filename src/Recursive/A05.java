package Recursive;

public class A05 {

    public static int Fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci of " + n + " is " + Fibonacci(n));
    }
}
//Fibonacci numbers are calculated by adding sum of the previous two numbers.