package Recursive;

public class A02 {
    public static void printInt(int number){
        String conversion = "0123456789ABCDEF";
        int base = 16;
        char digit = (char) (number % base);
        number = number / base;
        if (number != 0) {
            printInt(number);
        }
        System.out.print(conversion.charAt(digit));
    }
    public static void main(String[] args) {
        int n = 11;
        printInt(n);
    }

}

///Base value is provided along with the number in the function parameter
//Remainder of the number is calculated and stored in digit.
//· Number will be printed with higher order first then the lower order digits.
//Time Complexity is O(N)