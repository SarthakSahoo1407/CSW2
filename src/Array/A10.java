package Array;

public class A10 {
    public static int maxCircularSum(int[] arr, int size){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < size; i++) {
            currSum += arr[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;


    }
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("MaxCirculrSm: " + maxCircularSum(arr, arr.length));
    }
}
