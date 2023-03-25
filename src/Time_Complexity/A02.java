package Time_Complexity;

public class A02 {
    public static int fun2(int n){
        int m = 0;
        for (int i = 0; i < n; i++) { //This loop will run n times
            for (int j = 0; j < n; j++) { //This loop will run n times
                m+=1;//n^2 times
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fun2(n));
    }
}
