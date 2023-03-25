package Time_Complexity;

public class A06 {
    public static int fun5(int n) {
        int i, m = 0; i = n;
        while (i > 0) { //This loop will run log n times
            m += 1;
            i = i / 2;
        }
        return m;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fun5(n));
    }
}
