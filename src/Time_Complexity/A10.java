package Time_Complexity;

public class A10 {
    public static int fun10(int n){
        int i, j, m = 0;
        for (i = 0; i < n; i++) { //This loop will run n times
            for (j = i; j > 0; j--) { //This loop will run n times
                m += 1; //This statement will run n^2 times
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fun10(n));
    }
}
