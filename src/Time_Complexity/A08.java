package Time_Complexity;

public class A08 {
    public static int fun8(int n) {
        int i, j, m = 0;
        for (i = 0; i < n; i++) {//This loop will run n times
            for (j = 0; j < Math.sqrt(n); j++) {//This loop will run sqrt(n) times
                m += 1; //This statement will run n*sqrt(n) times
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fun8(n));
    }
}
