package Time_Complexity;

public class A03 {
    private static int fun3(int n) {
        int i, j, m = 0;
        for (i = 0; i < n; i++) { //This loop will run n times
            for (j = 0; j < i; j++) { //This loop will run n times
                m += 1; //n^2 times
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fun3(n));
    }


}
