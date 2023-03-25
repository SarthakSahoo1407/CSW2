package Array;

public class A05 {
    public static void WaveArray(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            if (i > 0 && arr[i - 1] > arr[i]) {
                swap(arr, i - 1, i);
            }
            if (i < arr.length - 1 && arr[i + 1] > arr[i]) {
                swap(arr, i + 1, i);
            }
        }
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
    //driver code
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 7, 8};
        WaveArray(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}