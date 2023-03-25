package Array;

public class A12 {
    public static int SmallestPositiveMissingNumber4(int[] arr, int size) {
        int temp;
        for (int i = 0; i < size; i++)
        {
            while (arr[i] != i + 1 && arr[i] > 0 && arr[i] <= size)
            {
                temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        for (int i = 0; i < size; i++)
        {
            if (arr[i] != i + 1)
                return i + 1;
        }
        return -1;
    }
    //driver code
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 7, 8};
        System.out.println(SmallestPositiveMissingNumber4(arr, arr.length));
    }
}
