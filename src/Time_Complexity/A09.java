package Time_Complexity;

public class A09 {
   public static int fun9(int n) {
        int i, j, m = 0;
        for (i = n; i > 0; i /= 2) { //This loop will run log n times
            for (j = 0; j < i; j++) { //This loop will run n times
                m += 1; //This statement will run n*log n times
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fun9(n));
    }
}
