package Array;

public class A09 {
    public static void ReverseArr(int arr[], int start, int stop){
        int temp;
        while (start < stop) {
            temp = arr[start];
            arr[start] = arr[stop];
            arr[stop] = temp;
            start++;
            stop--;
        }
    }
    //driver code
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 7, 8};
        ReverseArr(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
