package Array;

public class A07 {
    public static int maxPathSum(int[] arr1, int size1, int[] arr2, int size2) {
        int i = 0, j = 0;
        int result = 0, sum1 = 0, sum2 = 0;
        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j++];
            } else {
                result += Math.max(sum1, sum2);
                sum1 = 0;
                sum2 = 0;
                while (i < size1 && j < size2 && arr1[i] == arr2[j]) {
                    result += arr1[i++];
                    j++;
                }
            }
        }
        while (i < size1) {
            sum1 += arr1[i++];
        }
        while (j < size2) {
            sum2 += arr2[j++];
        }
        result += Math.max(sum1, sum2);
        return result;
    }

    //driver code
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 7, 10, 12, 15, 30, 34};
        int[] arr2 = {1, 5, 7, 8, 10, 15, 16, 19};
        System.out.println(maxPathSum(arr1, arr1.length, arr2, arr2.length));
    }
}
