package Time_Complexity;

public class A11 {

    public static  int fun11(int n){
        int i, j, k, m = 0;
        for (i = 0; i < n; i++) { // This loop will run n times
            for (j = i; j < n; j++) { // This loop will run n times
                for (k = j + 1; k < n; k++) { // This loop will run n times
                    m += 1;
                }
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fun11(n));
    }
}
