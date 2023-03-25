package Array;

public class A01 {
    public static int SumArray(int arr[]) {
        int size = arr.length;
        int total = 0;
        for (int index = 0; index < size; index++) {
            total = total + arr[index];
        }
        return total;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Sum of values in array: " + SumArray(arr));
    }
}

//All the elements of array are traversed and added. Finally, the result is returned. Time complexity is O(n).
