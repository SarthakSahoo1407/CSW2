package Time_Complexity;

public class A12 {
    public static int fun12(int n){
        int i, j = 0, m = 0;
        for (i = 0; i < n; i++) { // This loop will run n times
            for (; j < n; j++) { // This loop will run 1 times
                m += 1;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fun12(n));
    }
}
