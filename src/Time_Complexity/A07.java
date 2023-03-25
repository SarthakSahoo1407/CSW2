package Time_Complexity;

public class A07 {
    public static int fun7(int n) {
        int i, j, k, m = 0;
        for (i = 0; i < n; i++) { //This loop will run n times
            for (j = 0; j < n; j++) { //This loop will run n times
                m += 1; //This statement will run n^2 times
            }
        }
        for (i = 0; i < n; i++) { //This loop will run n times
            for (k = 0; k < n; k++) {   //This loop will run n times
                m += 1; //This statement will run n^2 times
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fun7(n));
    }
}
