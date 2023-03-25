package Array;

public class A06 {

    public static void Sort1toN(int[] arr, int size)
    {
        int curr, value, next;
        for (int i = 0; i < size; i++) {
            curr = i;
            value = -1;
            /* swaps to move elements in proper position.*/
            while (curr >= 0 && curr < size && arr[curr] != curr + 1) {
                next = arr[curr];
                arr[curr] = value;
                value = next;
                curr = next - 1;
            }
        }
    }
    //driver code
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 7, 8};
        Sort1toN(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
