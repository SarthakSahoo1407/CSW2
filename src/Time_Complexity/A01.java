package Time_Complexity;
//Example 1
public class A01 {

    public static int fun1(int n){
        int m = 0;
        for (int i = 0; i < n; i++) { //This loop will run n times
            m+=1;
        }
        return m;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fun1(n));
    }
}
