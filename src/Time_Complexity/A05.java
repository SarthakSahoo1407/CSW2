package Time_Complexity;

public class A05 {
    public static int fun5(int n){
        int i = 1, m =0;
        while (i < n) { //This loop will run log n times
            m+=1;
            i*=2;
        }
        return m;

    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fun5(n));
    }
}
